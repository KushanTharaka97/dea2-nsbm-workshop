package lk.nsbm.deaIIAssignment.libman.controller;

import lk.nsbm.deaIIAssignment.libman.model.Author;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @PostMapping("/author")
    public ResponseEntity<?> addAuthor(@RequestBody Author author){

        if (!author.isValid()){

            //something Return
            return ResponseEntity.badRequest().build();
        }
        return null;

    }
}
