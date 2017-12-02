package Chapter_10;

import Chapter_10.Chapter_Classes.MyString1;

/*
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new class MyString1):
    public MyString1(char[] chars);
    public char charAt(int index);
    public int length();
    public MyString1 substring(int begin, int end);
    public MyString1 toLowerCase();
    public boolean equals(MyString1 s);
    public static MyString1 valueOf(int i);
 */
public class Exercise_22 {
    public static void main(String[] args) {
        MyString1 myString = new MyString1("Lukasz");
        MyString1 myString2 = new MyString1("Lukasz");
        MyString1 myString3 = new MyString1("ZIOBRO");
        System.out.println(myString.getChars());
        System.out.println(myString.charAt(1));
        System.out.println(myString.substring(2,5));
        System.out.println(myString.equals(myString2));
        System.out.println(myString.equals(myString3));
        System.out.println((char)(65));
        System.out.println(myString3.toLowerCase().getChars());

    }
}
