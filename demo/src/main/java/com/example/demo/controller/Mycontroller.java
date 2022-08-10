package com.example.demo.controller;

import com.example.demo.entities.books;
import com.example.demo.sevices.booksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {

    @Autowired // object created automatically
    private booksService booksService1;

    public Mycontroller(booksService booksService1) {
        this.booksService1 = booksService1;
    }

    //get the books
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/books")
    public List<books> getBooks()
    {
        if (booksService1.getbooks()!=null) {
            return this.booksService1.getbooks();
        }
        else {
            return null;
        }
    }

    //get a specific book
    @GetMapping("/books/{booksID}")
    public books getbook(@PathVariable long booksID)
    {
        return this.booksService1.getbook((booksID));
    }
//    public ResponseEntity<HttpStatus> getbook(@PathVariable String booksID) {
//        try {
//            this.booksService1.getbook(Long.parseLong(booksID));
//            return new ResponseEntity<>(HttpStatus.OK);
////            return this.booksService1.getbook(Long.parseLong(booksID));
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    //add a new book
    @PostMapping("/books")
    public books addbook(@RequestBody books book)
    {
        return this.booksService1.addbook(book);
    }

    //update the book data
    @PutMapping("/books")
    public books updatebook(@RequestBody books book)
    {
        return this.booksService1.updatebook(book);
    }

    //delete the book data
    @DeleteMapping("/books/{booksID}")
    public ResponseEntity<HttpStatus> deletebook(@PathVariable String booksID) {
        try {
            this.booksService1.deletebook(Long.parseLong(booksID));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
