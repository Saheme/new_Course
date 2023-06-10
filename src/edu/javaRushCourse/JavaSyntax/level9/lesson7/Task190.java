package edu.javaRushCourse.JavaSyntax.level9.lesson7;

/**
 * Внеси исправления в метод main(), чтобы он выводил в консоли число 20.
 * В методе можно изменять только постинкремент на преинкремент и наоборот, а также постдекремент на предекремент и наоборот.
 *
 * Требования:
 * •	Исправь метод main() согласно условию.
 */
public class Task190 {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);
        System.out.println(b);
    }

}
//     2*4