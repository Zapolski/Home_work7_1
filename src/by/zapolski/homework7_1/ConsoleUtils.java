package by.zapolski.homework7_1;

import java.util.Scanner;

public class ConsoleUtils {
    public static int getIntFormConsole(String message){
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(sc.nextLine());
    }
}
