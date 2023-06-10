package edu.javaRushCourse.JavaSyntax.level11.lesson2.Task219;

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper(){
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int a){
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + a);
    }

    public Skyscraper(String str){
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + str);
    }
}
