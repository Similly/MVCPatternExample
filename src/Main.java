public class Main {

    public static void main (String args[]){
        Model student = new Model();
        View view = new View();

        Controller controller = new Controller(student, view);

        controller.setStudentInformation();
        controller.updateView();

        controller.setStudentInformation();
        controller.updateView();
    }
}
