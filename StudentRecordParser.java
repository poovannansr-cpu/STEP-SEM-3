import java.util.Scanner;

public class StudentRecordParser {

    static void parseStudentRecord(String csvLine) {

        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + fields[0]);
        System.out.println("Roll No: " + fields[1]);
        System.out.println("Dept: " + fields[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String csvLine = sc.nextLine();

        parseStudentRecord(csvLine);
    }
}