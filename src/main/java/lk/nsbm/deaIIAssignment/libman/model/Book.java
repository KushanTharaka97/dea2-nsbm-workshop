package lk.nsbm.deaIIAssignment.libman.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "book_seq_gen")
    @SequenceGenerator(name = "book_seq_gen")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "isbn", updatable = false)
    private String isbn;

    @Column(name = "classification")
    private String classification;

    @Column(name = "section")
    private Section section;

    @OneToMany
    private Set<Author> authors;

    @OneToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "id",
    foreignKey = @ForeignKey(name = "fk_book_publisher"))
    private Publisher publisher;

}
