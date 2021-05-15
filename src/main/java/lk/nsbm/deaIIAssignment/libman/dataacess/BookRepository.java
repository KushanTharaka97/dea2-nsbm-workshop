package lk.nsbm.deaIIAssignment.libman.dataacess;

import lk.nsbm.deaIIAssignment.libman.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
