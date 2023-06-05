package edu.javaRushCourse.JavaSyntax.level9.lesson6.example;

public class Ex3 {
    public static void main(String[] args) {
        int i = 0b000100;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(589));

        System.out.println(0b101);
        System.out.println(0b100011011);
        System.out.println(0b010000101);
        System.out.println(0b001001101);
        System.out.println("----------------");
        System.out.println(i);
        System.out.println("в десятичном : " + (i>>1));
        System.out.println("в двоичном виде: " + Integer.toBinaryString(i>>1));

    }
}


//2^8   2^7  2^6  2^5  2^4  2^3  2^2  2^1  2^0
//256   128   64   32   16   8    4    2    1
//                                1    0    1
//                                4 +   0   1  =5
// 1    0       0   0    1    1    0    1   1
// 256+16+8+2+1   = 256 +24+3 = 283

//2^8  2^7  2^6  2^5  2^4  2^3  2^2  2^1  2^0
//256  128   64   32   16   8    4    2    1
//133
// 0    1     0    0   0    0    1    0    1
// 589
//77  0  0      1     0    0    1    1    0     1