/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Jaakko
 */
public abstract class Subject {
    Set<Observer> observers = new HashSet();
    
    public void attach(Observer o){
        observers.add(o);
    }
    
    public void detach(Observer o) {
	observers.remove(o);
    }
	
    protected void ilmoita() {
	for(Observer o: observers) {
		o.update(this);
	}
    }
}
