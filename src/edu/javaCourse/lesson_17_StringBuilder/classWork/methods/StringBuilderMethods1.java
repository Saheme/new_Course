package edu.javaCourse.lesson_17_StringBuilder.classWork.methods;
class Car{}
public class StringBuilderMethods1 {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50);

        //1 метод length() -> int, возвращает длинну  StringBuilder
        System.out.println(sb1.length());
        System.out.println(sb3.length());

        System.out.println("-------------");

        //2. charAt(int index) -> char, показывает какой char эллемет находится в заданном индексе в StringBuilder
        System.out.println(sb1.charAt(8));

        System.out.println("-------------");

        //3. метод indexOf(4 перезаписанных метода overload) -> int , показывает на каком индексе находится определенный char или String , и выдает -1 если символ отсутствует
        System.out.println(sb1.indexOf("o", 2));

        System.out.println("-------------");

        //4. метод substring() -> String , возвращает кусок строки с заданного индекса и до конца строки StringBuilder.
        // перегруженный(overload) задает рамки с какого по какой символ выводить кусок строки, конечный индекс включен не будет.
        System.out.println(sb1.substring(5));
        String str = sb1.substring(1, 6);
        System.out.println(str);

        System.out.println("-------------");

        //5. метод subSequence(int start, int end) -> CharSequence, работает почти как substring(), на выходе последовательность char
        System.out.println(sb1.subSequence(1, 6));

        System.out.println("-------------");

        //6. метод append(dataType dt)-> StringBuilder, в конец строки StringBuilder добавляет значение (типов значений много)
        // Меняется уже имеюшийся StringBuilder, без создания нового
        sb1.append(22);
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);
        System.out.println(sb1.append(sb1));
        System.out.println(sb1.append("I'm a boy ?"));
        sb1.append(new Car());
        System.out.println(sb1);

        System.out.println("-------------");

        //7. метод insert(int toIndex,dataType dt )-> StringBuilder, вставляет в какой-то определенный индекс какое-то значение.
        StringBuilder sb2 = new StringBuilder("Good day!");
        System.out.println(sb2.insert(4,25.7));
        System.out.println(sb2.insert(sb2.length(),1785));

        System.out.println("-------------");

        //8. метод delete(int start, int end) -> StringBuilder, удаляет символы начиная и заканчивая заданными end не вулючен в удаление
        StringBuilder sb4 = new StringBuilder("Good day!");
        System.out.println(sb4.delete(2,7));

        System.out.println("-------------");

        //9. метод deleteCharAt(int index) -> StringBuilder, удаляет символ в заданном индексе
        StringBuilder sb5 = new StringBuilder("Hello World!");
        System.out.println(sb5.deleteCharAt(6));
    }
}
