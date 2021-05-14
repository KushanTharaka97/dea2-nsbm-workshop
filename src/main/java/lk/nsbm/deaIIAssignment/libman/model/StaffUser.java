package lk.nsbm.deaIIAssignment.libman.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@DiscriminatorValue(value = "1")
public class StaffUser extends User{
private String staffId;

    @OneToOne
    private LendingPolicy lendingPolicy;


}

