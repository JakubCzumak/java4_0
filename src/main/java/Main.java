/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Podaj imie studenta");
      String name = scanner.nextLine();
      System.out.println("Podaj wiek studenta");
      int age = scanner.nextInt();
     
      Student student = new Student(name, age);
      Service s = new Service();
      Student Student = new Student(name, age);
      System.out.println(Student);
      s.addStudent(Student);
      
      
      
      
      
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }
}