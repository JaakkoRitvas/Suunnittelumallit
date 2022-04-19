/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder;

/**
 *
 * @author Jaakko
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Director
		Tilaus tilaus = new Tilaus();
		
		// 
		Hesburger hesburgerinHampurilaisBuilder = new Hesburger();
		
		tilaus.luoHesburgerHamppari(hesburgerinHampurilaisBuilder);
		Hampurilainen heseHamppari = hesburgerinHampurilaisBuilder.getHamppari();
		
		System.out.println(heseHamppari.toString());
		
		System.out.println();
		
		
		
		McDonalds mcDonaldsHampurilaiseBuilder = new McDonalds();
		
		tilaus.luoMcDonaldsHamppari(mcDonaldsHampurilaiseBuilder);
		//String Builder käytössä
		StringBuilder mcHamppari = mcDonaldsHampurilaiseBuilder.getHamppari();
		
		System.out.println(mcHamppari);
    }
    
}
