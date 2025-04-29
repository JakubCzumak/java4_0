public class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Imię: " + name + ", Wiek: " + age + ", Kierunek: " + major;
    }

    public String toDataString() {
        return name + ";" + age + ";" + major;
    }

    public static Student fromDataString(String line) {
        String[] parts = line.split(";");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Nieprawidłowy format danych: " + line);
        }

        try {
            int age = Integer.parseInt(parts[1].trim());
            return new Student(parts[0].trim(), age, parts[2].trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Nieprawidłowy wiek: " + parts[1]);
        }
    }
}