package dev.codecounty.oops.strings;

public class StringsMethods {

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "AppLe";

//        Strings are Objects
//         There are 2 ways to create String Objects
//        Strings are immutable


        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Similar");
        } else {
            System.out.println("Not Similar");
        }


        String s0 = "";
        String s3 = "  hello Kitty  ";

        System.out.print(s3.length());
//        System.out.print();

        System.out.println();
        s3 = s3.trim();
        System.out.println(s3.length());
//        System.out.println(s4);


        s3 = "Apple";
        s3 = s3.toLowerCase();
        System.out.println(s3);

        s3 = s3.toUpperCase();
        System.out.println(s3);

        s3 = "hello Kitty";
        char ch = s3.charAt(0);
        System.out.println(s3.charAt(s3.length() - 1));


        s3 = "apple";
        s3 = s3.concat(" oranges");
        System.out.println(s3);

        s3 += " lichi";
        System.out.println(s3);

        int x = 99;
        String s4 = "" + x;
        System.out.println(s4);


        String str = 4343 + 89 - 67 + "" + 87 + 10;

        str = "apple is good";

        System.out.println(str.startsWith("ap"));
        System.out.println(str.toLowerCase().endsWith("od".toLowerCase()));

        str = "applepleppp";
        int index = str.indexOf("Apl");
        System.out.println(index);

        int lastIndex = str.lastIndexOf("pp");
        System.out.println(lastIndex);

        str = "appleple";
        System.out.println(str.substring(1, 5));

        System.out.println(str.substring(4, 8));
        System.out.println(str.substring(4));

    }
}