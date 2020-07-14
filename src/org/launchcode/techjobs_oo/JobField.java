package org.launchcode.techjobs_oo;

abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

    public JobField(int id) {
        this.id = id;
    }

    public JobField(String value) {
        this();
        this.value=value;


    }

    public JobField() {

    }

    public int getId() {
        return id;
    }

    public String getValue() {
       return value.toString();
    }

    public void setValue(String value) {
        this.value = value;
    }
}
