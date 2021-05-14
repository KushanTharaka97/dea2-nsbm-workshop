package lk.nsbm.deaIIAssignment.libman.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "library_card")
public class LibraryCard{
        private String cardId;
        private LocalDate localDate;
        private LocalDate expiryDate;
        private boolean isActive;
        @OneToOne(mappedBy = "user")
        private User user;


}
