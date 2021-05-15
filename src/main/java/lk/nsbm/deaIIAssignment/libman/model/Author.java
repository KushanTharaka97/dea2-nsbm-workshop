package lk.nsbm.deaIIAssignment.libman.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
    private Long id;

    @Column(name = "first.name",nullable = false)
    private String firstName;

    @Column(name = "last.name", nullable = false)
    private String lastName;

    @Column(name = "address", nullable = false,length = 1024)
    private String address;

    @Column(name = "nic",nullable = false, unique = true)
    private String nic;

    public boolean isValid() {
        return firstName != null && !firstName.isEmpty()
                && lastName != null && !lastName.isEmpty()
                && address != null && !address.isEmpty()
                && nic  != null && !nic.isEmpty() && Pattern.matches("[0-9]{9}(V|v|X|x)]",nic);
    }

//    @ManyToMany
//    private Set<Book> books;
}
