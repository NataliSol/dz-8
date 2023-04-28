
import java.util.ArrayList;
import java.util.List;

public class Student {
    public static int baseId;
    private int id;
    private String name;
    private List<String> taskDoneList = new ArrayList<>();
    private String surname;


    public Student(String name, String surname) {
        baseId++;
        this.id = baseId;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addDoneTask(String task) {
        taskDoneList.add(task);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taskDoneList=" + taskDoneList +
                ", surname='" + surname + '\'' +
                '}';
    }
}
