package com.mycompany.app;

import com.mycompany.app.DemoA;

/**
 */
public class DemoB extends DemoA {
    public void method1() {
        System.out.println(this.fieldProtected);

        if(this.fieldProtected == "test") {
            System.out.println( "test" );
        }
    }
    
}
