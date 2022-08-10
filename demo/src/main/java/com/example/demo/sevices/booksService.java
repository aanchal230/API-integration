package com.example.demo.sevices;

import java.util.List;
import com.example.demo.entities.books;

public interface booksService {

    public List<books> getbooks();

    public books getbook(long booksID);

    public books addbook(books book);

    public books updatebook(books book);

    public void deletebook(long parseLong);

}
