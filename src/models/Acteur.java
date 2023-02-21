package models;
import java.util.Date;
public class Acteur {
	
	private int id;
    private String firstName;
    private String lastName;
    private Date lastUpdate;

    public Acteur() {
    }

    public Acteur(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Acteur(int id, String firstName, String lastName, Date lastUpdate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

	

}
