import java.io.*;
import java.util.*;

public class Service {
    private static final String FILE_NAME = "db.txt";

    public void addStudent(Student student) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
        writer.write(student.toDataString());
        writer.newLine();
        writer.close();
    }

    public List<Student> getAllStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        int lineNumber = 1;

        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                lineNumber++;
                continue;
            }
            try {
                students.add(Student.fromDataString(line));
            } catch (Exception e) {
                System.out.println(" Błąd w linii " + lineNumber + ": \"" + line + "\" — " + e.getMessage());
            }
            lineNumber++;
        }

        reader.close();
        return students;
    }
}