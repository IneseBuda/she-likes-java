package com.sda.she_likes_java.operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Now, let's try soe operatores");
        System.out.println("Logical operators");

        boolean firstValue;
        boolean secondValue;
        boolean evaluationResult;
        System.out.println("&& operator");
        firstValue = true;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && true: " + evaluationResult);

        firstValue = true;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && false: " + evaluationResult);

        firstValue = false;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && true: " + evaluationResult);

        firstValue = false;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && false: " + evaluationResult);

        System.out.println();
        System.out.println("Letš test negation operator");
        firstValue = false;
        secondValue = !firstValue;
        System.out.println("!false is:" + secondValue);

        firstValue = true;
        secondValue = !firstValue;
        System.out.println("!true is:" + secondValue);
// negation of isPolite = naughty
        boolean isPolite = false;
        if (!isPolite){
            System.out.println("You're not polite, or just naughty");

        }
        boolean naughty = true;
        if (naughty){
            System.out.println("You're not polite, or just naughty");
        }
        System.out.println();
        System.out.println("Let's see now || operator - or operator");
        boolean hasGun = true;
        boolean hasGrenade = true;
        boolean isTerrorist = hasGrenade || hasGrenade;
        System.out.println("true || true :" + isTerrorist);

        hasGun = true;
        hasGrenade = false;
        isTerrorist = hasGun || hasGrenade;
        System.out.println("true || false is:" + isTerrorist);

        hasGun = false;
        hasGrenade = true;
        isTerrorist = hasGun || hasGrenade;
        System.out.println("False || true is:" + isTerrorist);

        hasGun = false;
        hasGrenade = false;
        isTerrorist = hasGun || hasGrenade;
        System.out.println("false || false is:" + isTerrorist);
    }
}
// !(value >=18)

