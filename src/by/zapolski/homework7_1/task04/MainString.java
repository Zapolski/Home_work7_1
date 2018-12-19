package by.zapolski.homework7_1.task04;

public class MainString {
    private char[] array;
    private int length;

    public MainString() {
        array = new char[0];
        length = 0;
    }

    public MainString(String str) {
        array = str.toCharArray();
        length = array.length;
    }

    public MainString(char ch) {
        array = new char[]{ch};
        length = 1;
    }

    public int getLength() {
        return length;
    }

    public MainString erase(){
        array=new char[0];
        length=0;
        return this;
    }

    public int findFirstChar(char ch){
        if (length!=0)
            for (int i = 0; i < length; i++)
                if (array[i]==ch) return i;
        return -1;
    }

    @Override
    public String toString() {
        return String.valueOf(array);
    }
}
