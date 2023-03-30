package org.examples;

public class Class_Table {
    int id;
    String classname;

    public Class_Table(int id, String classname) {
        this.id = id;
        this.classname = classname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
