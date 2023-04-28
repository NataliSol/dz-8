import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student studentOne = new Student("John", "Lennon");
        Student studentTwo = new Student("Paul", "McCartney");
        Student studentThree = new Student("Ringo", "Starr");
        Student studentFour = new Student("George", "Harrison");
        List<Student> studentList = new ArrayList<>();
        studentList.add(studentOne);
        studentList.add(studentTwo);
        String taskGit = "learn GIT";
        String taskLoop = "learn oops";
        String taskEncapsulations = "learn Encapsulations";
        String taskWord = "run Hello Word";
        HashMap<String, List<Student>> taskMap = new HashMap<>();
        List<Student> isDoneTaskGit = new ArrayList<>();
        isDoneTaskGit.add(studentTwo);
        isDoneTaskGit.add(studentOne);
        taskMap.put(taskGit, isDoneTaskGit);
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(studentFour);
        studentGroup.changeLeader(studentFour);
        studentGroup.deleteStudent(studentOne);
        studentGroup.changeStudentNameSurname(studentTwo, "bart", "Simpson");
        studentGroup.addTask(taskGit);
        studentGroup.addTask(taskLoop);
        studentGroup.addTask(taskEncapsulations);
        studentGroup.addTask(taskWord);
        studentGroup.sighStudentDoneTask(taskGit, studentOne);
        studentGroup.sighStudentDoneTask(taskGit, studentTwo);
        studentGroup.printAllTaskAndStudentIsDone();
    }
}