package edu.javaCourse.lesson_16_String.classWork;

public class FIndCapitalLetter {
    public static void main(String[] args) {
        String str = "Чтобы мудро жизнь прожить, знать надобно немало. Два важных правила запомни для начала : Ты " +
                "лучше голодай, чем что попало есть. И лучше будь один , чем вместе с кем попало ";

        String str2 = str.toUpperCase();
        char c1;
        char c2;

        for (int i = 0; i < str.length(); i++) {
            c1 = str.charAt(i);
            c2 = str2.charAt(i);
            if (c1 != ',' && c1 != '.' && c1 != ':' && c1 != ' ' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}
