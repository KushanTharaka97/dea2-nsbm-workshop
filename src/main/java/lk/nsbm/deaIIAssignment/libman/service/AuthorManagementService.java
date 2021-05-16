package lk.nsbm.deaIIAssignment.libman.service;

import lk.nsbm.deaIIAssignment.libman.model.Author;

//dependency injection principal
public interface AuthorManagementService {
    Author add();

    Author update();

    Author get(Integer id);

    boolean delete();


}
