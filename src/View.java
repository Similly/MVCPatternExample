import java.util.Scanner;

public class View {

    private String name;
    private String rollNo;

    public void printStudentInformation(String name, String rollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + name);
        System.out.println("rollNo: " + rollNo);
    }

    public void getStudentDetails(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = in.nextLine();
        System.out.println("\n");
        System.out.println("Enter rollNo: ");
        rollNo = in.nextLine();
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }
}
