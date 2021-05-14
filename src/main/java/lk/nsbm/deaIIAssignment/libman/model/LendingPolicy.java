package lk.nsbm.deaIIAssignment.libman.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "lending_policy")
public class LendingPolicy{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "publisher_seq_gen")
    @SequenceGenerator(name = "publisher_seq_gen")
    private Long id;

    @Column(name = "ref_count", nullable = false)
    private int referenceBookCount;

    @Column(name = "lending_count", nullable = false)
    private int lendingBookCount;

    @Column(name = "ref_max_period", nullable = false)
    private int referenceMaxBorrowingPeriod;

    @Column(name = "lending_max_period", nullable = false)
    private int lendingMaxBorrowingPeriod;
}
