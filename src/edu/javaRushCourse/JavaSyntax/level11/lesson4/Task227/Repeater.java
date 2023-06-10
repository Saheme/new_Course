package edu.javaRushCourse.JavaSyntax.level11.lesson4.Task227;

public class Repeater {
    private String trajectory = "parabolic";
    private int frequency = 30;


    public String getTrajectory(){
        return trajectory;
    }

    public void setTrajectory(String trajectory){
        this.trajectory = trajectory;
    }

    public int  getFrequency(){
        return frequency;
    }

    public void setFrequency(int frequency){
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return String.format("Repeater trajectory is %s, with a %dGHz communication frequency.", trajectory, frequency);
    }
}
