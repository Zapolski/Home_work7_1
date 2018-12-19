package by.zapolski.homework7_1.task04;

public class Main {
    public static void main(String[] args) {

        MainString[] array = new MainString[3];

        array[0] = new MainString();
        array[1] = new MainString("hello");
        array[2] = new MainString('j');

        for (MainString item: array) System.out.println("Строка: ["+item+"], длина строки: "+item.getLength());
        System.out.println("Символ 'l' в строке "+array[1]+
                " первый раз встречается под индексом - "+array[1].findFirstChar('l'));
        System.out.print("Строка ["+array[1]);
        System.out.println("] после очистки ["+array[1].erase()+"]");

    }
}
