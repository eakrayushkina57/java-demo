package com.mycompany.app;

/**
 */
public class DemoB extends DemoA {
    public void method1() {
        System.out.println(this.fieldProtected);

        if (this.fieldProtected.equals("test")) {
            System.out.println("test");
        }
    }

    public void methodCheckedException() throws Exception {
        throw new Exception("Some checked error");
    }

    public void methodUncheckedError() {
        throw new Error("Some system error");
    }

}
