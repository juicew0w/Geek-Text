package com.geektext.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile
{
    @Id
    private String email;

    private String password;

    private String address;

    private String fname;

    private String lname;

    private String phone;

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

    public String getFirstName()
    {
        return fname;
    }

    public void setFirstName(String fname)
    {
        this.fname = fname;
    }

    public String getLastName()
    {
        return lname;
    }

    public void setLastName(String lname)
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