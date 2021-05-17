package lk.nsbm.deaIIAssignment.libman.controller;

import lk.nsbm.deaIIAssignment.libman.model.Author;
import lk.nsbm.deaIIAssignment.libman.service.AuthorManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    private AuthorManagementService authorManagementService;

    @PostMapping("/author")
    public ResponseEntity<?> addAuthor(@RequestBody Author author){

        if (!author.isValid()){

            //something Return
            return ResponseEntity.badRequest().build();
        }
        author = this.authorManagementService.add(author);
        return ResponseEntity.ok(author);
    }

    @PutMapping("/author")
    public ResponseEntity<?> updateAuthor(@RequestBody Author author){
        return null;
    }

    @Autowired
    public AuthorController(AuthorManagementService authorManagementService) {
        this.authorManagementService = authorManagementService;
    }
}
