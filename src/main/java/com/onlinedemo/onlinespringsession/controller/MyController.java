package com.onlinedemo.onlinespringsession.controller;

import com.onlinedemo.onlinespringsession.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

   // @Autowired //DI facilities
    private MyImpl myImpl;

//    public MyController(MyImpl myImpl){
//        this.myImpl=myImpl;
//    }
    @Autowired
    public void setMyImpl(MyImpl myImpl) {
        this.myImpl = myImpl;
    }

    @GetMapping(value="/check")
    public String check(){
       return myImpl.getData();
    }
}
