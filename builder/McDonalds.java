/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Jaakko
 */

//String Builder

public class McDonalds implements HampurilaisBuilder{
	
	private StringBuilder strB = new StringBuilder(500);
	
	private Sampyla sampyla;
	private Pihvi pihvi;
	private Salaatti salaatti;
	private Kastike kastike;
	private Mausteet mausteet;
	private boolean kurkku;
	private boolean ketsuppi;

	@Override
	public void setSampyla(Sampyla sampyla) {
		this.sampyla = sampyla;
	}

	@Override
	public void setPihvi(Pihvi pihvi) {
		this.pihvi = pihvi;
	}

	@Override
	public void setSalaatti(Salaatti salaatti) {
		this.salaatti = salaatti;
	}

	@Override
	public void setKastike(Kastike kastike) {
		this.kastike = kastike;
	}

	@Override
	public void setMausteet(Mausteet mausteet) {
		this.mausteet = mausteet;
	}

	@Override
	public boolean setKurkku(boolean kurkku) {
		return this.kurkku = kurkku;
	}

	@Override
	public boolean setKetsuppi(boolean ketsuppi) {
		return this.ketsuppi = ketsuppi;
	}
	
	public StringBuilder getHamppari() {
		return strB.append((new Hampurilainen(sampyla, pihvi, salaatti, kastike, mausteet, kurkku, ketsuppi).toString()));
	}

}

