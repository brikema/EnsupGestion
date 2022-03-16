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
@Table(name = "Teacher")
public class Teacher extends LivingPerson{
    public String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(int id, String name, String email, String adress, int phoneNumber, String firstName, String subject) {
        super(id, name, email, adress, phoneNumber, firstName);
        this.subject = subject;
    }

    public Teacher(String firstName, String subject) {
        super(firstName);
        this.subject = subject;
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", subject='" + subject + '\'' +
                '}';
    }
}
