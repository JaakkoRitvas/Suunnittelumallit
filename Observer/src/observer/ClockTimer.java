/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Jaakko
 */
public class ClockTimer extends Subject {
    
    int second;
    int minute;
    int hour;
            
    public ClockTimer(){
        second = 50;
        minute = 59;
        hour = 23;
    }

    public int getSecond() {
        return second;
    }


    public int getMinute() {
        return minute;
    }

  
    public int getHour() {
        return hour;
    }
    public void tick() throws InterruptedException {

		// Haluan että yksi tikki on 1 sekunnin
		if (second < 59) {
			second++;
			ilmoita();
		} else {
			second = 0;
			if (minute < 59) {
				minute++;
			} else {
				minute = 0;
				if (hour < 23) {
					hour++;
				} else {
					hour = 0;
				}
			}

		}

	}

   

    
}
