package com.example.demo.sevices;

import java.util.List;

import com.example.demo.Dao.booksDao;
import com.example.demo.entities.books;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@JsonInclude(JsonInclude.Include.NON_NULL)
public class booksServiceimpl implements booksService{

    @Autowired
    private booksDao booksDao1;

    public booksServiceimpl(booksDao booksDao1) {
        this.booksDao1 = booksDao1;
    }

    @Override
    public List<books> getbooks()
    {
        return booksDao1.findAll();
    }

    @Override
    public books getbook(long booksid)
    {

        return booksDao1.findById(booksid).get();
    }
////    {
////        books entity = booksDao1.getReferenceById(parseLong);
////        booksDao1.save(entity);
////    }


    @Override
    public books addbook(books book)
    {
        booksDao1.save(book);
        return book;
    }

    @Override
    public books updatebook(books book)
    {
       booksDao1.save(book);
        return book;
    }

    @Override
    public void deletebook(long parseLong) {
        books entity = booksDao1.getReferenceById(parseLong);
        booksDao1.delete(entity);
    }

}
