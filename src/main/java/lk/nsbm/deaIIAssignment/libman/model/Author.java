package lk.nsbm.deaIIAssignment.libman.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;
import java.util.regex.Pattern;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "author_seq_gen")
    @SequenceGenerator(name = "author_seq_gen")
    @Column(name = "id", unique = true,nullable = false,updatable = false)
    private Long id;

    @Column(name = "first.name",nullable = false)
    private String firstName;

    @Column(name = "last.name", nullable = false)
    private String lastName;

    @Column(name = "bio" , length = 1024)
    private String biography;

    public boolean isValid() {
        return firstName != null && !firstName.isEmpty()
                && lastName != null && !lastName.isEmpty();
//                && address != null && !address.isEmpty()
//                && nic  != null && !nic.isEmpty() && Pattern.matches("[0-9]{9}(V|v|X|x)]",nic);
    }

    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "book_authors",
            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
    private Set<Book> books;
}
