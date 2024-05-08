package model;

import java.util.Date;
//todo продумать методы для класса по мониторингу
//todo продумать как понять что задача выполнена. Варианты: задача выполнена (успели в срок); задача выполнена (не в срок); задачи не выполнили
//todo сделать класс resolution (название; ID; тип - фиксированные - не началось, в работе, завершенно)
//todo сделать класс status (имя; id; тип - открыты, закрыты)
public class Task {
    private int id;
    private String title;
    private String description;
    private String assignee;
    private Date dueDate;
    private Date completionDate;
    private String status;
    private String resolution;

    public Task(int id, String title, String description, String assignee, Date dueDate, String status, String resolution) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.assignee = assignee;
        this.dueDate = dueDate;
        this.status = status;
        this.resolution = resolution;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
        updateStatus();
    }

    public String getStatus() {
        return status;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    private void updateStatus() {
        if (completionDate == null) {
            status = "Задача не выполнена";
        } else if (completionDate.before(dueDate) || completionDate.equals(dueDate)) {
            status = "Задача выполнена";
        } else {
            status = "Задача выполнена, но не в срок";
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                ", dueDate=" + dueDate +
                ", completionDate=" + completionDate +
                ", status='" + status + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}



