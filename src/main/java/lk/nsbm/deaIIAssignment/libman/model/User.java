package lk.nsbm.deaIIAssignment.libman.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen")
    protected Long Id;

    @Column(name = "firs_name", nullable = false)
    protected String firstName;

    @Column(name = "last_name", nullable = false)
    protected String lastName;

    @Column(name = "nic", nullable = false, unique = true)
    protected String nic;

    @OneToOne
    private LendingPolicy lendingPolicy;
}


