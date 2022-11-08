package statepackage;

public class Blastoise extends State {

	Blastoise(Pokemon pokemon) {
		super(pokemon);
		pokemon.setNimi("Blastoise");
		this.toiminta();
	}
	
	public void blastoisenTemppu() {
		System.out.println("Ammun tykeistä vettä");
	}

	@Override
	public void kehity() {
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitBlast(this);
	}

	@Override
	public void toiminta() {
		System.out.println(pokemon.getNimi() + " viimeinen evoluutio!");
		System.out.println("Nyt sit vaan seikkailua ympäriinsä");

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			
			pokemon.nostaTasoa();
			System.out.println("Kehityin tason ylöspäin olen nyt " + pokemon.getTaso());
			pokemon.bPv.visitBlast(null);
			if(pokemon.getTaso() == 100) {
				System.out.println("Viimeinen leveli, en enää kehity");
				break;
			}

		}

	}
	

}
