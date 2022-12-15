package com.cybertek.services;

import com.cybertek.interfaces.ExtraSeesions;

public class OfficeHours implements ExtraSeesions {
    @Override
    public int getHours() {
        return 4;
    }
}
