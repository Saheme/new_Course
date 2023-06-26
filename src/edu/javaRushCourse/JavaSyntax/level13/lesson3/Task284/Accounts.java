package edu.javaRushCourse.JavaSyntax.level13.lesson3.Task284;

public class Accounts {
    private static final String[] accounts = new String[100];

    static {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = "user" + i;
        }
    }

    public static String[] getAccounts() {
        return accounts;
    }
}
