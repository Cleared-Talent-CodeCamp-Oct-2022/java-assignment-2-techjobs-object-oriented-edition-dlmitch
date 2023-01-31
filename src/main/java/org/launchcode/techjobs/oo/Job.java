package org.launchcode.techjobs.oo;
//org.launchcode.techjobs.oo.test
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;


    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //constructor to initialize a unique ID
    public Job() {
        this.id = nextId;
        nextId++;
    }

    // constructors to initialize the other five fields AND call the first in order to initialize
    //  the 'id' field
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
       this();
       this.name = name;
       this.employer = employer;
       this.location = location;
       this.positionType = positionType;
       this.coreCompetency = coreCompetency;
    }

    // Add custom equals and hashCode methods.
    // Consider two Job objects "equal" when their id fields match.

    @Override
    public String toString() {
        String noData = "Data not available";
        if(name.isEmpty()) {
            this.setName(noData);
        }
        if (employer.getValue().isEmpty()) {
            employer.setValue(noData);
        }
        if (location.getValue().isEmpty()) {
            location.setValue(noData);
        }
        if (positionType.getValue().isEmpty()) {
            positionType.setValue(noData);
        }
        if (coreCompetency.getValue().isEmpty()) {
            coreCompetency.setValue(noData);
        }
        return "\nID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Employer: " + employer + "\n" +
                "Location: " + location + "\n" +
                "Position Type: " + positionType + "\n" +
                "Core Competency: " + coreCompetency + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // getters for each field EXCEPT nextId.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    // setters for each field EXCEPT nextID and id.
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
