package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class  Dev {

  @Autowired // field injection
  @Qualifier("laptop") //here, name of the class , but lowercase
    private Computer comp;

//   public Dev(Laptop laptop) //constructor injection, @Autowired is not required here, its optional
//   {
//       this.laptop=laptop;
//   }


//    @Autowired
//    public void setLaptop(Laptop laptop) //this is setter injection, @Autowired is required here
//    {
//        this.laptop=laptop;
//    }
    public void build()
    {
        comp.compile();
        comp.debug();
        System.out.println("working on some project");
    }


}
