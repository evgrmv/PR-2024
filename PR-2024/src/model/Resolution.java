package model;

import java.util.Date;

public class Resolution {
    private String name;
    private Date resolutiondate;
    private int ID;
    private String type;

    public Resolution(String name, int ID, String type) {
        this.name = name;
        this.ID = ID;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Resolution resolution = new Resolution("ResolutionOne", 1, "Не началось");
        System.out.println(resolution.toString());
    }
}

