package Chapter_10.Chapter_Classes;

public class MyString1 {
    private char[] chars;

    // constructor
    public MyString1(char[] chars){
        this.chars = new char[chars.length];
        for (int character = 0; character < chars.length; character++) {
            this.chars[character] = chars[character];
        }
    }

    // transform string into chars array
    public MyString1(String string){
        this.chars = string.toCharArray();
    }

    /** Returns character at provided index */
    public char charAt(int index){
        return chars[index];
    }

    /** Returns length of string */
    public int length(){
        return chars.length;
    }

    /** Returns substring */
    public MyString1 substring(int begin, int end){
        char[] sub = new char[end - begin];
        for (int i = begin; i < end; i++) {
            sub[i - begin] = chars[i];
        }
        return new MyString1(sub);
    }
    
    /** Returns lower case letters string */
    public MyString1 toLowerCase(){
        char[] lowercase = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int ascii = (char)chars[i];
            if ((char)chars[i] <= 90 || (char)chars[i] >= 65){
                lowercase[i] = (char)(chars[i] + 32);
            } else {
                lowercase[i] = chars[i];
            }
        }
        return new MyString1(lowercase);
    }

    /** Checks if strings are equal */
    public boolean equals(MyString1 s){
        if (s.length() != this.length()){
            return false;
        } else{
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != s.charAt(i)){
                    return false;
                }
            }
            return true;
        }
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }
}
