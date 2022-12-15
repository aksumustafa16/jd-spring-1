package com.cybertek.services;

import com.cybertek.interfaces.ExtraSeesions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSeesions {
    @Override
    public int getHours() {
        return 4;
    }
}
