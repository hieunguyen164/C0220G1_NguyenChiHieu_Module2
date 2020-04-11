package b3_lopvadoituong.baitap;

public class StopWatch {

    private long starTime;
    private long endTime;
    public StopWatch(){
        getStarTime();
    }
    public long getStarTime(){
        return  starTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public long start(){
        return starTime = System.currentTimeMillis();
    }
    public long stop(){
        return endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return (getEndTime()-getStarTime());
    }


}
