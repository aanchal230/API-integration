package com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "borrow")
public class borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrow_id", nullable = false)
    private Long borrowID;

    @Column(name = "date_borrow", nullable = false)
    private Date date_borrow;

    @Column(name = "due_date", nullable = false)
    private Date due_date;

    public borrow(Long borrowID, Date date_borrow, Date due_date) {
        this.borrowID = borrowID;
        this.date_borrow = date_borrow;
        this.due_date = due_date;
    }

    public Long getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(Long borrowID) {
        this.borrowID = borrowID;
    }

    public Date getDate_borrow() {
        return date_borrow;
    }

    public void setDate_borrow(Date date_borrow) {
        this.date_borrow = date_borrow;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }
}

