package Chapter_01;
/*
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
 */
public class Exercise_12 {
    public static void main(String[] args) {
        double avg_speed = ((24.0 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);
        System.out.println("Avg speed: " + avg_speed);
    }
}
