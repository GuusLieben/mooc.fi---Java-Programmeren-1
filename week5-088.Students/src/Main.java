
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = reader.nextLine();

            if (name.equals("")) {
                for (Student student : list) {
                    System.out.println(student);
                }
                System.out.print("Give search term: ");
                String term = reader.nextLine();

                System.out.println("Result(s): ");
                for (Student student : list) {
                    if (student.getName().contains(term)) {
                        System.out.println(student);
                    }
                }
                break;
            } else {
                System.out.print("Studentnumber: ");
                String studentnumber = reader.nextLine();

                Student n = new Student(name, studentnumber);

                list.add(n);
            }
        }
    }
}