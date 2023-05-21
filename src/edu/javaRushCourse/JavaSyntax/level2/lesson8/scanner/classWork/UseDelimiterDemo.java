package edu.javaRushCourse.JavaSyntax.level2.lesson8.scanner.classWork;

import java.util.Scanner;

/**
 * !!!!! Внимание для работы useDelimiter() , в while надо использовать hasNext(), а в переменную ложить методом next()
 */
public class UseDelimiterDemo {
    public static void main(String[] args) {
        String str = "Я ем клюкву'" +"и не морщусь ,'" +"какая сила воли!!!";
        Scanner scan =new Scanner(str);
        scan.useDelimiter("'");
        while (scan.hasNext()){
            String line = scan.next();
            System.out.println(line);
        }
        scan.close();
    }
}
