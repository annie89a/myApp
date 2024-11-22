package com.telusko.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Override
    public void compile()
    {
        System.out.println("compiling on desktop");
    }

    @Override
    public void debug()
    {
        System.out.println("debugging on desktop");
    }
}
