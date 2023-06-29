package edu.professionalJava.part4_Collections.lesson8_ListIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Проверяем ,является ли слово палиндромом.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        String str = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next()!=reverseIterator.previous()){
           isPalindrome = false;
           break;
            }

        }
        if (isPalindrome){
            System.out.println("The word is a palindrome");
        }else {
            System.out.println("The word isn't a palindrome");
        }
    }
}
