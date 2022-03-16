package eu.ensup.EnsupGestion.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@Table(name = "LivingPerson")
public class LivingPerson extends Person{
    public String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LivingPerson(int id, String name, String email, String adress, int phoneNumber, String firstName) {
        super(id, name, email, adress, phoneNumber);
        this.firstName = firstName;
    }

    public LivingPerson(String firstName) {
        this.firstName = firstName;
    }

    public LivingPerson() {
    }
}
