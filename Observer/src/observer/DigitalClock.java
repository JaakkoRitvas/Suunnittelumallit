/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Jaakko
 */
public class DigitalClock implements Observer {
    
    private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.attach(this);
	}
           
        @Override
	public void update(Subject s) {

		if(s == timer) {
			draw();
		}
		
	}
	
	private void draw() {
		int second = timer.getSecond();
		int minute = timer.getMinute();
		int hour = timer.getHour();
		
		          System.out.println("Digitaalinen kello:" + hour +":"+ minute +":" +second);
	}
}
