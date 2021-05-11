package lk.nsbm.deaIIAssignment.libman.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "publisher_seq_gen")
    @SequenceGenerator(name = "publisher_seq_gen")
    private Long id;


    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "address",nullable = false,length = 1024)
    private String address;


}
