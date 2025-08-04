package com.codewithraj;

import java.util.Date;

public class DataTypes {
    int age=10;
    double weight=55.6;
    float height=12.5f;
    char gender='M';
    boolean isMale=true;

    //Reference type
    Date date=new Date();

    public void informationPrint()
    {
        System.out.println(age+" "+weight+" "+height+" "+gender+" "+isMale +" "+date);
    }
}
