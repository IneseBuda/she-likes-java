package com.sda.she_likes_java.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println(getMyName(true));
        System.out.println(getMyName(false));
    }

    public static String getMyName(boolean fullName){
        //if condition is true return first part otherwise second
       String result =  fullName ? "Inese Buda": "Buda";
      //  return result;
        String result2 = null;
        if (fullName) {
            result2 = "long value";
        }else {
            result2="short";
        }

        //the same with ternary operator
        result2= fullName? "Long valua": "short";
        return  result;
      //  if(fullName){
      //      return "Inese Buda";
      //  }else {
      //      return "Inese";
      //  }
    }
}
