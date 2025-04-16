/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args){
    try {
      Scanner scanner = new Scanner(System.in);
        List<Student>  bazaStudents = new ArrayList<Student>();
      boolean dziala = true;
      while (dziala)
        }
        {
          System.out.println("\n---MENU ---");
          System.out.println("1. Dodaj studenta");
          System.out.println("2.Wyswietl wszystkich studentów");
          System.out.println("3. Wyjście");
          int opcja = scanner.nextInt();
      switch (opcja) {
        case 1 :
          
      System.out.println("Podaj imie studenta");
      String name = scanner.nextLine();
      System.out.println("Podaj wiek studenta");
      int age = scanner.nextInt();
     
      Student student = new Student(name, age);
      Service s = new Service();
      Student Student = new Student(name, age);
      System.out.println(Student);
      s.addStudent(Student);
      
        case 2 :
          System.out.println("Wszyscy studenci");
          for (Student s : bazaStudents){
            System.out.println(s);
          }
          break;
      
          
      }
          
      
      
      
      
     catch (IOException e) {
     }
          
  
}
    
  