package statepackage;

public class Wartortle extends State {



	Wartortle(Pokemon pokemon) {
		super(pokemon);
		pokemon.setNimi("Wartortle");
		toiminta();
	}

	@Override
	public void kehity() {
		pokemon.kehity(new Blastoise(pokemon));
	}
	public void wartortlenTemppu() {
		System.out.println("Osaan surffata");
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitWart(this);
	}
	
	@Override
	public void toiminta() {

		System.out.println("Hei olen nyt " + pokemon.getNimi() + " !");
		this.wartortlenTemppu();
		
		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			
			pokemon.nostaTasoa();
			System.out.println("Kehityin tason ylöspäin olen nyt " + pokemon.getTaso());
			pokemon.bPv.visitWart(null);
			

			
			if (pokemon.getTaso() == 33) {
				System.out.println("Olen kehittymässä!");
				System.out.println();
				this.kehity();
				break;
			}

		}
		

	}
	

}