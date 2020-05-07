package com.onlinedemo.onlinespringsession.impl;

import com.onlinedemo.onlinespringsession.myinterface.InterfaceDemo;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements InterfaceDemo {

    @Override
    public String getData() {
        return "Hello DI and IoC";
    }
}
