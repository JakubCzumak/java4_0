public class Student {
  private String Name;
  private int Age;
  private String Major;
  private String BirthDate;

  public Student(String name, int age, String major, String birthDate) {
    Name = name;
    Age = age;
    Major = major;
    BirthDate = birthDate;
  }

  public String GetName() { return Name; }
  public int GetAge() { return Age; }
  public String GetMajor() { return Major; }
  public String GetBirthDate() { return BirthDate; }

  @Override
  public String toString() {
    return Name + " " + Age + " " + Major + " " + BirthDate;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ", 4); // podziel tylko na 4 części
    if (data.length != 4) {
      return null;
    }

    try {
      int age = Integer.parseInt(data[1]);
      return new Student(data[0], age, data[2], data[3]);
    } catch (NumberFormatException e) {
      return null;
    }
  }
}