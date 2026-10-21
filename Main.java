import java.io.File;
public class Main {
    public static void main(String[] args){
         File file = new File("/Users/iradukundagrace/Documents/Registration System/Students.txt");
         RegistryManager manager = new RegistryManager();

         manager.loadStudentsFromFile(file.getAbsolutePath());

        System.out.println("\n all students");
        manager.displayAllStudents();

        System.out.println("\n student by major");
        manager.groupStudentsByMajor();
    }
}