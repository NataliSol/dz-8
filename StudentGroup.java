
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGroup {
    private List<Student> studentList = new ArrayList<>();
    private HashMap<String, List<Student>> taskMap = new HashMap<>();
    private Student studentLeader;

    public StudentGroup(List<Student> studentList) {
        if (studentList.isEmpty()) {
            System.out.println("Student group couldn't be empty.");
        } else {
            this.studentList = studentList;
            this.studentLeader = studentList.get(0);
            System.out.println("Student group was created with student lead " + studentLeader.getName() + " " + studentLeader.getSurname());
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    //змінити старосту
    public void changeLeader(Student student) {
        studentLeader = student;
    }

    //додати студента
    public void addStudent(Student student) {
        studentList.add(student);
    }

    //видалити студента
    public void deleteStudent(Student student) {
        if (studentList.contains(student)) {
            studentList.remove(student);
            System.out.println("Student was successfully removed from the group.");
        } else
            System.out.println("Student was not found in this group.");
    }

    //перейменувати студента
    public void changeStudentNameSurname(Student student, String name, String surname) {
        if (studentList.contains(student)) {
            for (Student student1 : studentList) {
                if (student1.equals(student)) {
                    student1.setName(name);
                    student1.setSurname(surname);
                }
            }
            System.out.println("Student was updated.");
        } else
            System.out.println("Student was not found in this group.");
    }

    //додати завдання (для всієї групи)
    public void addTask(String task) {
        if (!taskMap.containsKey(task)) {
            taskMap.put(task, new ArrayList<>());
            System.out.println("Task \"" + task + "\" was added to the group.");
        } else {
            System.out.println("Task \"" + task + "\" is already in the group.");
        }
    }
    //позначити завдання як виконане (для зазначеного студента)
    public void sighStudentDoneTask(String task, Student student) {
        taskMap.get(task).add(student);
        student.addDoneTask(task);
    }

    public void printAllTaskAndStudentIsDone() {
        for (Map.Entry<String, List<Student>> pair : taskMap.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
