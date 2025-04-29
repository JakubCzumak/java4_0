import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Service s = new Service();

    while (true) {
      System.out.println("Wybierz opcję:");
      System.out.println("1. Dodaj studenta");
      System.out.println("2. Wyświetl wszystkich studentów");
      System.out.println("3. Wyjście");

      String option = scanner.nextLine();

      try {
        if (option.equals("1")) {
          System.out.print("Imię: ");
          String name = scanner.nextLine();

          System.out.print("Wiek: ");
          int age = Integer.parseInt(scanner.nextLine());

          System.out.print("Kierunek studiów: ");
          String major = scanner.nextLine();

          s.addStudent(new Student(name, age, major));

        } else if (option.equals("2")) {
          var students = s.getStudents();
          for (Student current : students) {
            System.out.println(current);
          }
        } else if (option.equals("3")) {
          break;
        } else {
          System.out.println("Nieprawidłowa opcja.");
        }
      } catch (IOException e) {
        System.out.println("Błąd podczas operacji na pliku: " + e.getMessage());
      } catch (NumberFormatException e) {
        System.out.println("Nieprawidłowy format liczbowy.");
      }
    }

    scanner.close();
  }
}