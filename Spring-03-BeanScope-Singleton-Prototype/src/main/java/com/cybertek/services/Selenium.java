package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Selenium implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: 15");
    }

    public void myDestroyMethod(){
        System.out.println("Executing destroy method");
    }


}
