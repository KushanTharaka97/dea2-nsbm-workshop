package lk.nsbm.deaIIAssignment.libman.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "user")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.INTEGER)
public abstract class User{
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
@SequenceGenerator(name= "user_seq_gen")
protected Long Id;

@Column(name = "firs_name", nullable = false)
protected String firstName;

@Column(name = "last_name", nullable = false)
protected String lastName;

@Column(name = "nic", nullable = false , unique = true )
protected String nic;

@Column(name = "user_type", nullable = false, updatable = false, insertable = false)
protected Integer userType;
}


