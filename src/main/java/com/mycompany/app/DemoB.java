package com.mycompany.app;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 */
public class DemoB extends DemoA {
    private static final String Map = null;

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

    public void methodDArray() {
        
        List<Integer> nums = new ArrayList<>();
        
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        //int numsSize = nums.size();
        //System.out.println(numsSize);

        //for (int i = 0; i < numsSize; i++) {
        //    System.out.println(nums.get(i));
        //}

        Set<String> s1 = new HashSet<>();

        s1.add("string1");
        s1.add("string2");
        s1.add("string1");

        System.out.println(s1);

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "string0");
        map.put(2, "string1");
        map.put(3, "string0");
        map.put(4, "string1");

        System.out.println(map);
    }
        

}