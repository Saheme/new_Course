package edu.javaRushCourse.JavaSyntax.level4.lesson3;

import java.util.Scanner;

/**
 * Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
 * Вывести на экран полученную сумму и завершить программу.
 * <p>
 * Требования:
 * •	Программа должна считывать данные с клавиатуры.
 * •	Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
 * •	В программе необходимо использовать цикл while.
 */
public class Task55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;
            boolean isExit =false;
             int sum=0;
        while (!isExit){
            if (scan.hasNextInt()) {
                 line = scan.nextLine();
                int number = Integer.parseInt(line);
                sum += number;
            }else if (scan.hasNextLine()){
                line = scan.nextLine();
            isExit=line.equals("ENTER");
            }
               }
        System.out.println(sum);
        }
    }
/*
 Scanner scan = new Scanner(System.in);
            boolean isExit =false;
             int sum=0;
        while (!isExit){
            String line  = scan.nextLine();
            int number = Integer.parseInt(line);
                  sum+=number;
            isExit=line.equals("0");
               }
        System.out.println(sum);
        }
    }
  ;*/
