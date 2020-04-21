package com.sruthy.animalgame.utilities;
import java.util.Timer;
import java.util.TimerTask;

public class StopWatch {

	static int interval;
	static Timer timer;

	public void start() {
			
		    int delay = 1000;
		    int period = 1000;
		    timer = new Timer();
		    interval = Integer.parseInt("4");
	
		    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {
            System.out.println(setInterval());

        }
    }, delay, period);
		
		 
}

private static final int setInterval() {
    if (interval == 1)
        timer.cancel();
    return --interval;
}
}