package edu.javaCourse.lesson_23_overriding.classWork.seven;

public class B10 extends A10{
    double d1 = super.d1;

    String s1 = super.s1 + " , friend";
    //boolean s1 = true ;
    int summa(int ... a){
        int result =super.summa(a);
        System.out.println("Summa : " + result);
            return result;
    }
    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1 );
        System.out.println(b.d1);
    }
}
