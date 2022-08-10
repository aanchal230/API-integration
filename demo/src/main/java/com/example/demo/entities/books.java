package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
public class books{
    @Id
    @Column(name = "books_id", nullable= false)
    private Long booksID;

    @Column(name = "book_name", nullable= false , length=45)
    private String bookName;

    @Column(name = "author",nullable= false ,length=45)
    private String Author;

    @JoinColumn(name="category_id" , nullable = false, foreignKey = @ForeignKey(name= "category_id_fk"))
    @Column(name = "category_id")
    private Integer CategoryID;

    @Column(name = "status", length = 45)
    private String Status;

    @Column(name = "date_added")
    private Date dateAdded;

    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(name = "member_id_fk"))
    @Column(name = "member_id" )
    private Integer memberID;

    @JoinColumn(name = "borrow_id" ,foreignKey = @ForeignKey(name = "borrower_id_fk"))
    @Column(name = "borrow_id")
    private Integer borrowerID;

//    public books(Long booksID, String bookName, String author, Integer categoryID, String status, Date dateAdded, Integer memberID, Integer borrowerID) {
//        this.booksID = booksID;
//        this.bookName = bookName;
//        Author = author;
//        CategoryID = categoryID;
//        Status = status;
//        this.dateAdded = dateAdded;
//        this.memberID = memberID;
//        this.borrowerID = borrowerID;
//    }


    public long getBooksID() {
        return booksID;
    }

    public void setBooksID(Long booksID) {
        this.booksID = booksID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getBorrowerID() {
        return borrowerID;
    }

    public void setBorrowerID(int borrowerID) {
        this.borrowerID = borrowerID;
    }

    @Override
    public String toString() {
        return "books{" +
                "booksID=" + booksID +
                ", bookName='" + bookName + '\'' +
                ", Author='" + Author + '\'' +
                ", CategoryID=" + CategoryID +
                ", Status='" + Status + '\'' +
                ", dateAdded=" + dateAdded +
                ", memberID=" + memberID +
                ", borrowerID=" + borrowerID +
                '}';
    }

}
