package model;

import java.util.Date;
//todo продумать методы для класса по мониторингу
//todo продумать как понять что задача выполнена. Варианты: от задачи отказались; задача выполнена (успели в срок); задача выполнена (не в срок); задачи не выполнили
public class Task {
    private String name;
    private TaskStatus status;

    public Task(String name) {
        this.name = name;
        this.status = TaskStatus.PENDING; // Изначально задача установлена в статус "Ожидание"
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskStatus getStatus() {
        return status;
    }

    // Другие методы и поля...
//todo перенести в класс Main
    @Deprecated
    public static void main(String[] args) {
        Task task1 = new Task("Задача 1");
        task1.setStatus(TaskStatus.COMPLETED_ON_TIME);
        System.out.println(task1.getStatus());  // Выводит "COMPLETED_ON_TIME"
    }
}

enum TaskStatus {
    PENDING,      // Задача ожидает выполнения
    @Deprecated
    COMPLETED_ON_TIME,     // Задача выполнена в срок
    @Deprecated
    COMPLETED_DELAYED,     // Задача выполнена, но не в срок
    REJECTED      // Задача отклонена
}


