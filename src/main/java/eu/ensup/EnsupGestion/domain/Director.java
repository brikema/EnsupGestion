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
@Table(name = "Director")
public class Director extends LivingPerson{

    public Director(int id, String name, String email, String adress, int phoneNumber, String firstName) {
        super(id, name, email, adress, phoneNumber, firstName);
    }

    public Director(String firstName) {
        super(firstName);
    }

    public Director() {
    }

    @Override
    public String toString() {
        return "Director{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
