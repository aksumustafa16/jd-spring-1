package com.cybertek.services;

import com.cybertek.services.interfaces.Course;
import com.cybertek.services.interfaces.ExtraSessions;

public class Java implements Course {

    private OfficeHours officeHours;

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " + (20 + officeHours.getHours()));
    }
}
