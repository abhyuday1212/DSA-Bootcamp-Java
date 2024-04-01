package com.kunal;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x); // 90
        // niche wla x ka scope kewl apne upr wle braces k bracket me rhega

        int x; // the class variable at line 4 is shadowed by this

        // System.out.println(x); // scope will begin when value is initialised , therefore beech me access krogr to error dega
        x = 40;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
