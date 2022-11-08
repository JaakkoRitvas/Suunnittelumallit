package statepackage;

public class BonuspisteetVisitor implements Visitor{
	
	//Pokemonien bonuspisteet teht a
	
	private int bonusP = 0;
	

	public int getBonusP() {
		return bonusP;
	}
	public void setBonusP(int bonusP) {
		this.bonusP = bonusP;
	}
	@Override
	public void visitSq(Squirtle squirtle) {
		this.bonusP += 2;
		System.out.println("Bonuspisteitä lisätty 2, nykyiset bonuspisteet " + this.bonusP);
		
	}
	@Override
	public void visitWart(Wartortle wart) {
		this.bonusP += 5;
		System.out.println("Bonuspisteitä lisätty 5, nykyiset bonuspisteet " + this.bonusP);
		
	}
	@Override
	
	public void visitBlast(Blastoise blast) {
		this.bonusP += 10;
		System.out.println("Bonuspisteitä lisätty 10, nykyiset bonuspisteet " + this.bonusP);
		
	}
	

}
