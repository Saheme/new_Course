package edu.javaRushCourse.JavaSyntax.level14.lesson6.task323;

import java.util.HashMap;
import java.util.Map;

public enum Error {
    NETWORK_ERROR(100), SYSTEM_ERROR(200), COMPILATION_ERROR(300);

    private final int errorCode;
    private static final Map<Integer,Error> errorMap =new HashMap<>();
    static {
        Error[]array = Error.values();
        for (int i = 0; i < array.length; i++) {
        errorMap.put()
        }

        }



    Error(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public static Error getErrorByID(Integer errorNumber) {
        return errorMap.get(errorNumber);
    }

    public Map<Integer, Error> getErrorMap() { return errorMap; }

    @Override
    public String toString() {
        return String.format("Error{ errorCode = %s }", errorCode);
    }
}
