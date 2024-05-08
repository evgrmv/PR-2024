package model;

public class Status {
    private String name;
    private int id;
    private String type;

    public Status(String name, int id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Status status = new Status("StatusOne", 1, "open");
        System.out.println("Name: " + status.getName());
        System.out.println("ID: " + status.getId());
        System.out.println("Type: " + status.getType());
    }
}
