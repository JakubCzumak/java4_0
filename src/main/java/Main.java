import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Wyświetl wszystkich studentów");
            System.out.println("3. Wyjście");
            System.out.print("Wybierz opcję: ");

            int opcja = scanner.nextInt();
            scanner.nextLine(); // czyści bufor

            switch (opcja) {
                case 1:
                    System.out.print("Podaj imię studenta: ");
                    String name = scanner.nextLine();
                    System.out.print("Podaj wiek studenta: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // czyści bufor
                    System.out.print("Podaj kierunek studiów: ");
                    String major = scanner.nextLine();

                    Student student = new Student(name, age, major);
                    try {
                        service.addStudent(student);
                        System.out.println(" Student dodany.");
                    } catch (IOException e) {
                        System.out.println(" Błąd podczas zapisu do pliku.");
                    }
                    break;

                    case 2:
                    try {
                        List<Student> students = service.getAllStudents();
                        if (students.isEmpty()) {
                            System.out.println("Brak studentów w bazie.");
                        } else {
                            System.out.println(" Lista studentów:");
                            for (Student s : students) {
                                System.out.println(s);
                            }
                        }
                    } catch (IOException | IllegalArgumentException e) {
                        System.out.println(" Błąd: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println(" Zakończono program.");
                    scanner.close();
                    return;

                default:
                    System.out.println(" Nieprawidłowa opcja.");
            }
        }
    }
}