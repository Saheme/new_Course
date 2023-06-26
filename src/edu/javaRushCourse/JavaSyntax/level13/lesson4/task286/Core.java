package edu.javaRushCourse.JavaSyntax.level13.lesson4.task286;

public class Core {
    private int coreNumber;

    public int getCoreNumber() {
        return coreNumber;
    }

    public Core(int coreNumber) {
        this.coreNumber = coreNumber;
    }

    @Override
    public String toString() {
        return "{coreNumber=" + coreNumber + "} ";
    }
}
