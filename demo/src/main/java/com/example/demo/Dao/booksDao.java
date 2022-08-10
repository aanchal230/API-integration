package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.books;

public interface booksDao extends JpaRepository <books, Long> {

}
