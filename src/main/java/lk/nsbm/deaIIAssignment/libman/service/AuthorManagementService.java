package lk.nsbm.deaIIAssignment.libman.service;

import lk.nsbm.deaIIAssignment.libman.model.Author;
import org.springframework.stereotype.Service;

//dependency injection principal

public interface AuthorManagementService {

    Author add(Author author);

    Author update();

    Author get(Integer id);

    boolean delete();


}
