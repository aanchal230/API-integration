package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class category {
    @Id
    @Column(name = "category_id", nullable= false)
    private String CategoryID;

    @Column(name = "classname",nullable= false ,unique= true ,length= 45)
    private String className;

    public category(String categoryID, String className) {
        CategoryID = categoryID;
        this.className = className;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
