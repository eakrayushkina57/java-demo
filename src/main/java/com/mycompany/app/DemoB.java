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

    public void methodArray() {
        int[] myArray = new int[10];

        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        myArray[5] = 6;
        myArray[6] = 7;
        myArray[7] = 8;
        myArray[8] = 9;
        myArray[9] = 10;

        for (int i = 0; i < 10; i++) {
            System.out.println(myArray[i]);
        }
    }

}
