/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package builder;

/**
 *
 * @author Jaakko
 */
public interface HampurilaisBuilder {
    // sämpylä
	public void setSampyla(Sampyla sampyla);
	
	// pihvi
	public void setPihvi(Pihvi pihvi);
	
	// salaatti
	public void setSalaatti(Salaatti salaatti);
	
	// kastike
	public void setKastike(Kastike kastike);
	
	// mausteet
	public void setMausteet(Mausteet mausteet);
	
	// kurkku
	public boolean setKurkku(boolean kurkku);
	
	// ketsuppi
	public boolean setKetsuppi(boolean ketsuppi);
}
