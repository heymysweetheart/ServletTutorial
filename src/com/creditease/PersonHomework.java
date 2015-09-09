package com.creditease;

/**
 * Created by leo on 15/9/9.
 */
public class PersonHomework {
    String sex;
    double weight;
    double height;
    int age;

    public double getXCDXIndex(String sex,double weight,double height,int age){
        double result=0.0;
        if(sex.equals("female")){
            result=(9.6*weight)+(1.8*height)-(4.7*age)+655;
        }
        else if(sex.equals("male")){
            result=(13.7*weight)+(5.0*height)-(6.8*age)+66;
        }
        System.out.println(result);
        return result;
    }
}
