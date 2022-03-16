package eu.ensup.EnsupGestion.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Table(name = "Student")
public class Student extends LivingPerson{
    public Date birthdayDate;

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public Student(int id, String name, String email, String adress, int phoneNumber, String firstName, Date birthdayDate) {
        super(id, name, email, adress, phoneNumber, firstName);
        this.birthdayDate = birthdayDate;
    }

    public Student(String firstName, Date birthdayDate) {
        super(firstName);
        this.birthdayDate = birthdayDate;
    }

    public Student(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", birthdayDate=" + birthdayDate +
                '}';
    }
}
