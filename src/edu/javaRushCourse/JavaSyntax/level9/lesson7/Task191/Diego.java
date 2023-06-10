package edu.javaRushCourse.JavaSyntax.level9.lesson7.Task191;

import java.util.Random;

public class Diego {
    public int hashSum;

    {
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            hashSum += random.nextInt(10) * Math.pow(10, i);
        }
    }
}
