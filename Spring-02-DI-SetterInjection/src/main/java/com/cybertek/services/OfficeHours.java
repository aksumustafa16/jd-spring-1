package com.cybertek.services;

import com.cybertek.services.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 5;
    }
}
