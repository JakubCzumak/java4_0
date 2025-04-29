public class Student {
  private String Name;
  private int Age;
  private String Major;

  public Student(String name, int age, String major) {
    Name = name;
    Age = age;
    Major = major;
  }

  public String GetName() { return Name; }
  public int GetAge() { return Age; }
  public String GetMajor() { return Major; }

  @Override
  public String toString() {
    return Name + " " + Age + " " + Major;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ", 3); // podziel tylko na 3 części
    if (data.length != 3) {
      return null; // dane niepoprawne
    }

    try {
      int age = Integer.parseInt(data[1]);
      return new Student(data[0], age, data[2]);
    } catch (NumberFormatException e) {
      return null; // niepoprawny wiek
    }
  }
}