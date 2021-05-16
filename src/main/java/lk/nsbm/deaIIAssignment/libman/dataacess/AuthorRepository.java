package lk.nsbm.deaIIAssignment.libman.dataacess;

import lk.nsbm.deaIIAssignment.libman.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
}
