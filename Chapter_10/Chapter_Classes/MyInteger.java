package Chapter_10.Chapter_Classes;
public class MyInteger {
    // fields / properties
    private int value;

    // constructor
    public MyInteger(int value) {
        this.value = value;
    }

    // getter (accessor)
    public int getValue() {
        return value;
    }

    /** Method returns true if number is even */
    public boolean isEven(){
        if (value % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    /** Method returns true if number is odd */
    public boolean isOdd(){
        if (value % 2 != 0){
            return true;
        } else {
            return false;
        }
    }

    /** Method returns true if number is prime */
    public boolean isPrime(){
        for (int i = 2; i < getValue(); i++) {
             if (this.value % i == 0){
                 return false;
             }
        }
        return true;
    }

/**
 *
 * Static methods - not need to create object of class to invoke method.
 * Static methods can be invoked directly from class.
 *
  */

    /** Static method returns true if number is even */
    public static boolean isEven(int value){
        return value % 2 ==0;
    }

    /** Static method returns true if number is odd */
    public static boolean isOdd(int value){
        return value % 2 != 0;
    }

    /** Static method returns true if number is prime */
    public static boolean isPrime(int value){
        for (int i = 2; i < value; i++) {
            if (value % i == 0){
                return false;
            }
        }
        return true;
    }

    /** Static method returns true if number is even */
    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    /** Static method returns true if number is odd */
    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd();
    }

    /** Static methods returns true if number is prime */
    public static boolean isPrime(MyInteger myInteger){
        return myInteger.isPrime();
    }

    /** Method returns true if value of this object is equal to specific value */
    public boolean equals(int value){
        return this.value == value;
    }

    /** Method returns true if value of this object is equal to specific value */
    public boolean equals(MyInteger myInteger){
        return this.value == myInteger.value;
    }

    /** Method converts an array of numeric characters to int value. **/
    public static int parseInt(char[] value) {

        double valueDouble = 0;
        int toPower = value.length - 1;
        for (char aValue : value) {
            valueDouble += Math.pow(10, toPower--) * (aValue - '0');
        }
        return (int)valueDouble;
    }

    /** Method parses array of chars into int value */
    public static int parseInt(String value) {
        return MyInteger.parseInt(value.toCharArray());
    }


}
