package edu.javaCourse.lesson_27_Exeptions;

public class ExDemo10 {
    void marathon(int airTemper, int speed) throws PodvernutNoguException{
        if (speed>12){
            throw new PodvernutNoguException("Too much speed " +  speed);
        }
        if (airTemper >32){
            throw new SveloMishcuException();
        }
        System.out.println("You ran marathon!!!");
    }

    public static void main(String[] args)  {
        ExDemo10 ex = new ExDemo10();
        try {
        ex.marathon(30,10);

        }catch (PodvernutNoguException e){
            System.out.println(e.getMessage());
        }
    }
}
class PodvernutNoguException extends Exception{
    public PodvernutNoguException(String message) {
        super(message);
    }

    public PodvernutNoguException() {
    }
}
class SveloMishcuException extends RuntimeException{
    public SveloMishcuException(String message) {
        super(message);
    }

    public SveloMishcuException() {
    }
}
