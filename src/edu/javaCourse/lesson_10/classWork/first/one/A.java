package edu.javaCourse.lesson_10.classWork.first.one;

import edu.javaCourse.lesson_10.classWork.first.three.*; // звездочка укахывает, что из пакета three можно использовать все классы, без использования повторного импорта
import edu.javaCourse.lesson_10.classWork.first.two.B;
import static edu.javaCourse.lesson_10.classWork.first.three.G.variable;// import static для импорта static переменной для  использования ее без имени класса (G.variable)

public class A {
    public static void main(String[] args) {
        edu.javaCourse.lesson_10.classWork.first.two.B b1 = new edu.javaCourse.lesson_10.classWork.first.two.B ();
        B b2 = new B(); // чтобы не писать полный путь к нужному классу - указываем его в import
        C c = new C();
        System.out.println(c.height);
        System.out.println(c.str);
        System.out.println(C.count);
        G g =new G();
        System.out.println(variable);


    }

}
    class A2{
       B b1 = new B(); //если в фаиле 2 и более class ,то import  работает для всех классов из одного файла
    }
