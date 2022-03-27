/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Jaakko
 */
public class Main {
    
    
    public static void main(String[] args) throws InterruptedException {
		
		ClockTimer timer = new ClockTimer();
		DigitalClock digiClock = new DigitalClock(timer);
		
		while(true) {
			TimeUnit.SECONDS.sleep(1);
			timer.tick();
		}

	}
    
}
