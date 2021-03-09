package com.company;

public class Main {

    enum Languages {C, PYTHON, JAVA}

    public static void main(String[] args) {
	// write your code here
        // Write hello world!
        var msg = "Hello World... Now in Java!";
        System.out.println(msg);

        System.out.println(Languages.PYTHON);
        System.out.println(Languages.PYTHON.ordinal());

        Languages[] arr = Languages.values();

        for (Languages lang:arr)
        {
            System.out.println(lang);
        }


        System.out.println(Languages.valueOf("JAVA"));

    }
}
