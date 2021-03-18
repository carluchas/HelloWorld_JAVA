package com.company;

public class Main {

    enum Languages {C, PYTHON, JAVA}

    public static void main(String[] args)
    {
	    // write your code here
        // Write hello world!
        var msg = "Hello World... Now in Java!";
        identifiedLanguage(msg);

        System.out.println(Languages.PYTHON);
        System.out.println(Languages.PYTHON.ordinal());

        Languages[] arr = Languages.values();

        for (Languages lang:arr)
        {
            System.out.println(lang);

            if (lang == Languages.C)
            {
                identifiedLanguage("Pasa C");
            }
            else if (lang == Languages.PYTHON)
            {
                identifiedLanguage("Pasa PYTHON");
            }
            else if (lang == Languages.JAVA)
            {
                identifiedLanguage("Pasa JAVA");
            }

            switch (lang)
            {
                case C -> identifiedLanguage("Pasa otra vez C");
                case PYTHON -> identifiedLanguage("Pasa otra vez PYTHON");
                case JAVA -> identifiedLanguage("Pasa otra vez JAVA");
            }

        }

        System.out.println(Languages.valueOf("JAVA"));
    }

    private static void identifiedLanguage(String message)
    {
        System.out.println(message);
    }
}
