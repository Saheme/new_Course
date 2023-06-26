package edu.javaRushCourse.JavaSyntax.level13.lesson4.task286;

import java.util.List;

public class Robot {
    private final List<Core> cores;

    public Robot(List<Core> cores) {
        this.cores = cores;
    }

    public List<Core> getCores() {
        return cores;
    }
}
