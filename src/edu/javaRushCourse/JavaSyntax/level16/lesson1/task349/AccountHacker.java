package edu.javaRushCourse.JavaSyntax.level16.lesson1.task349;

public class AccountHacker implements AutoCloseable{
    public AccountHacker() {
        System.out.println("Initializing connection...");
    }
    public void hackAccount(){
        System.out.println("Hacking account...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Hack completed.");

    }
}
