import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Task compito1 = new Task("Compito breve", OffsetDateTime.parse("2024-01-31T18:00:00+01:00"),StatoEnum.NONCOMPLETATO);
        Task compito2 = new Task("Compito di durata media", OffsetDateTime.parse("2024-02-05T18:00:00+01:00"),StatoEnum.NONCOMPLETATO);
        Task compito3 = new Task("Compito lungo", OffsetDateTime.parse("2024-02-15T18:00:00+01:00"),StatoEnum.NONCOMPLETATO);
        Task compito4 = new Task("Compito passato", OffsetDateTime.parse("2024-01-30T18:00:00+01:00"),StatoEnum.NONCOMPLETATO);


        ArrayList<Task> taskArrayList = new ArrayList<>();
        taskArrayList.add(compito1);
        taskArrayList.add(compito2);
        taskArrayList.add(compito3);
        taskArrayList.add(compito4);



        ToDoList toDoList = new ToDoList(taskArrayList);
        toDoList.addTask(compito1);
        toDoList.addTask(compito2);
        toDoList.addTask(compito3);



        toDoList.seeTask();
        //toDoList.removeTask(compito3);

        toDoList.completedTask(compito4);
        toDoList.completedTask(compito1);
        //toDoList.detailTask();
    }
}