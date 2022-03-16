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
@Table(name = "Class")
public class Class {
    public String subject;
    public Float nbHour;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Float getNbHour() {
        return nbHour;
    }

    public void setNbHour(Float nbHour) {
        this.nbHour = nbHour;
    }

    public Class(String subject, Float nbHour) {
        this.subject = subject;
        this.nbHour = nbHour;
    }

    public Class() {
    }

    @Override
    public String toString() {
        return "Class{" +
                "subject='" + subject + '\'' +
                ", nbHour=" + nbHour +
                '}';
    }
}
