package statepackage;

public class Squirtle extends State {

	Squirtle(Pokemon pokemon) {
		super(pokemon);
		pokemon.setTaso(1);
		pokemon.setNimi("Squirtle");
		toiminta();
	}

	@Override
	public void kehity() {
		pokemon.kehity(new Wartortle(pokemon));
	}
	
	public void squirtlenTemppu() {
		System.out.println("Syljen vettä");
	}


	@Override
	public void toiminta() {
		
		System.out.println("Hei olen " + pokemon.getNimi() + " !");
		System.out.println("Aloitus tasoni on " + pokemon.getTaso());
		
		this.squirtlenTemppu();
		
		
		while (true) {
				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			pokemon.nostaTasoa();
			System.out.println("Nousin yhden levelin ylöspäin olen nyt " + pokemon.getTaso());
			
			
			if(pokemon.getTaso() == 10) {
				System.out.println("Olen tarpeeksi isotasoinen kehittymään!");
				System.out.println();
				this.kehity();
				break;
			}
			
		}
		

	}


}
