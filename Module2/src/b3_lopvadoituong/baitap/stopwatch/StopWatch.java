package b3_lopvadoituong.baitap.stopwatch;

public class StopWatch {

    private long starTime;
    private long endTime;
    public StopWatch(){
        this.getStarTime();
    }
    public long getStarTime(){
        return  this.starTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public long start(){
        return this.starTime = System.currentTimeMillis();
    }
    public long stop(){
        return this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return (this.getEndTime()-this.getStarTime());
    }


}
