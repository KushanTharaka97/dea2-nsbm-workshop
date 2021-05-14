package lk.nsbm.deaIIAssignment.libman.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@DiscriminatorValue(value = "2")
public class Student extends User{
private String studentId;

    @OneToOne
    private LendingPolicy lendingPolicy;


}
