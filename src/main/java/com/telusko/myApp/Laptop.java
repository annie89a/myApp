package com.telusko.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
public class Laptop implements Computer {
    @Override
    public void compile()
    {
        System.out.println("compiling on laptop");
    }

    @Override
    public void debug()
    {
        System.out.println("debugging on laptop");
    }
}
