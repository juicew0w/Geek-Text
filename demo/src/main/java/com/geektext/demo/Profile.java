package com.geektext.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile
{
    /**************************************************************************
     * CLASS VARIABLES
     *************************************************************************/
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer userID;

    @Id
    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String fname;

    @NotNull
    private String lname;

    private String address;
    private String phone;

    /**************************************************************************
     * GETS / SETTERS
     *************************************************************************/
    public Integer getUserID()
    {
        return userID;
    }

    public void setUserID(Integer userID)
    {
        this.userID = userID;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}