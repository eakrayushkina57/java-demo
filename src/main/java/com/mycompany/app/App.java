package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello Katy!");

        DemoB b = new DemoB();
        b.method1();

        // b.methodCheckedException();
        // try {
        //     b.methodCheckedException();
        // } catch(Exception e) {
        //     System.out.println(e);
        // }

        //b.methodUncheckedError();

        b.methodArray();

    }
}
