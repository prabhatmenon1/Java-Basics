
package com.training.arrays;

public class Stringarray {

    public static void main(String[] args) {

        String[] names = new String[4];

        names[0] = "Ram";
        names[1] = "Ravi";
        names[2] = "Raj";
        names[3] = "Ravi";

        System.out.println(names[0]);

        for (String str : names) {
            System.out.println(str.toUpperCase());
        }
    }
}

	


