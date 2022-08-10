package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "member")
public class member {
    @Id
    @Column(name = "member_id",nullable= false)
    private int memberID;

    @Column(name = "member_name",nullable= false ,length= 45)
    private String memberName;

    @Column(name = "address",nullable= false, length= 100)
    private String Address;

    @Column(name = "contact",nullable= false, length= 45)
    private String Contact;

    @Column(name = "status",length=45)
    private String Status;

    public member(int memberID, String memberName, String address, String contact, String status) {
        this.memberID = memberID;
        this.memberName = memberName;
        Address = address;
        Contact = contact;
        Status = status;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}



