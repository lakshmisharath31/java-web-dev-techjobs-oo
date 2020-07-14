package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job extends JobField{

    private int id;
    private static int nextId = 1;
    private String value;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job(){
       id = nextId;
       nextId++;

    }
    public Job(String aValue) {
        //this will call the default constructor from the above.
        this();
        this.value = aValue;
    }


    public Job(String name,Employer employer,Location location,PositionType positionType,CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
       Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    public CoreCompetency  getCoreCompetency() {
        return coreCompetency;
    }

    @Override
    public String toString(){
        return String.format("ID: %d\n Name: %s\n Employer: %s\n Location: %s\n Position Type: %s\n Core Competency: %s",id,name,employer.getValue(),location.getValue(),positionType.getValue(),coreCompetency.getValue());
        //return String.format("ID: %d\n Name: %s\n Employer: %s\n Location: %s\n Position Type: %s\n Core Competency: %s");

    }

}


// TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
//  other five fields. The second constructor should also call the first in order to initialize
//  the 'id' field.

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
//  match.

// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//  and id.