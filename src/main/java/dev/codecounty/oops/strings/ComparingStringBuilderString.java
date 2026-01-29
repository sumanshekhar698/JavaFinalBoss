package dev.codecounty.oops.strings;

public class ComparingStringBuilderString {

    public static void main(String[] args) {
        String str = "apple";
        StringBuilder sb = new StringBuilder("apple");

//        System.out.println(str == sb);

        if(str.equals(sb.toString())){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}