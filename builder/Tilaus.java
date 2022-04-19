/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Jaakko
 */
//Director
public class Tilaus {
    public void luoHesburgerHamppari(HampurilaisBuilder hb) {
		hb.setSampyla(new Sampyla("Jyvä sämpylä"));
		hb.setPihvi(new Pihvi("Kanapihvi"));
		hb.setSalaatti(new Salaatti("Jäävuori"));
		hb.setKastike(new Kastike("Currymajoneesi"));
		hb.setMausteet(new Mausteet("Grillimauste"));
		hb.setKetsuppi(true);
		hb.setKurkku(false);
	}
	
	public void luoMcDonaldsHamppari(HampurilaisBuilder hb) {
		hb.setSampyla(new Sampyla("Perus sämpylä"));
		hb.setPihvi(new Pihvi("100% naudan jauheliha"));
		hb.setSalaatti(new Salaatti("Jäävuori"));
		hb.setKastike(new Kastike("Ei kastiketta"));
		hb.setMausteet(new Mausteet("Pippuri, Suola"));
		hb.setKetsuppi(true);
		hb.setKurkku(true);
	}
}
