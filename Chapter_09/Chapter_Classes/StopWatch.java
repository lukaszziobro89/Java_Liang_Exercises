package Chapter_09.Chapter_Classes;

public class StopWatch {

    // Private data fields
    private long startTime;
    private long endTime;

    /** A no-arg constructor that initializes startTime with the current time. */
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    // startTime getter method
    public long getStartTime() {
        return startTime;
    }

    // endTime getter method
    public long getEndTime() {
        return endTime;
    }

    /** A method named start() that resets the startTime to the current time. */
    public void start(){
        startTime = System.currentTimeMillis();
    }

    /** A method named stop() that sets the endTime to the current time. */
    public void stop(){
        endTime = System.currentTimeMillis();
    }

    /** A method named getElapsedTime() that returns the elapsed time for the
     stopwatch in milliseconds. */
    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }

}
