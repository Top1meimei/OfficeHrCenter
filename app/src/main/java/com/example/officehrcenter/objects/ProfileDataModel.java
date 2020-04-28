package com.example.officehrcenter.objects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProfileDataModel {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String office;
    private String time;
    private String msg;

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public ProfileDataModel(int id, String name, String email, String phone, String office, Date dateTime, String msg){
        if (email == null || email.equals("null")){ email = ""; }
        if (phone == null || phone.equals("null")){ phone = ""; }
        if (msg == null || msg.equals("null")){ msg = ""; }
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.office = office;
        this.time = DATE_FORMAT.format(dateTime);
        this.msg = msg;
    }

    public int getID(){return this.id;}

    public String getName(){return this.name;}

    public String getEmail(){
        if (this.email.equals("")){
            return "Not available";
        }
        return this.email;
    }

    public String getPhone(){
        if (this.phone.equals("")){
            return "Not available";
        }
        return this.phone;
    }

    public String getOffice(){return this.office;}

    public String getTime(){return this.time;}

    public String getMsg(){
        return this.msg;
    }

}
