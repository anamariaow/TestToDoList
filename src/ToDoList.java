import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class ToDoList {
    private ArrayList<Task> taskArrayList;

    public ToDoList(ArrayList<Task> taskArrayList) {
        this.taskArrayList = new ArrayList<>();
    }

    public ArrayList<Task> getTaskArrayList() {
        return taskArrayList;
    }

    public void setTaskArrayList(ArrayList<Task> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }

    public void addTask(Task task) {
        taskArrayList.add(task);
    }

    public void removeTask(Task task) {
        taskArrayList.remove(task);
    }

    public void seeTask() {
        for (Task task : taskArrayList) {
            if (taskArrayList.isEmpty()) {
                System.out.println("Non ci sono compiti");
            } else {
                System.out.println("Compito presente: " + task.getDescrizione());
            }
        }
    }

    //se la scadenza è prima di oggi segna il task come completato altrimenti stampa "compito non completato"
    public void completedTask(Task task) {

        for (Task taskcurrent : taskArrayList) {
            if (taskcurrent.equals(task)) {
                taskcurrent.setStatoEnum(StatoEnum.COMPLETATO);
                System.out.println("Compito completato: " + task.getDescrizione() + ", scaduto il: " + task.getScadenza());
            }
        }

//        OffsetDateTime scadenza = task.getScadenza();
//        if (scadenza.isBefore(OffsetDateTime.now())) {
//            task.setStatoEnum(StatoEnum.COMPLETATO);
//            System.out.println("Compito completato: " + task.getDescrizione() + ", scaduto il: " + task.getScadenza());
//        } else {
//            System.out.println("Compito non idoneo ad essere contrassegnato come completato");
//        }
    }

    //Visualizzare il dettaglio di un compito identificato attraverso un parametro specifico (se non è completato).
    public void detailTask() {
        for (Task task : taskArrayList) {
            if (task.getStatoEnum().equals(StatoEnum.NONCOMPLETATO)) {
                System.out.println("Descrizione compito: " + task.getDescrizione() + " - scadenza: " + task.getScadenza().format(DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ITALY)) + " - stato: " + task.getStatoEnum());

            }
        }
    }
}

