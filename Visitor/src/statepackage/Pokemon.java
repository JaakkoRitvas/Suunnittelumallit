package statepackage;

public class Pokemon {
	
	private State state;
	
	Visitor bPv = new BonuspisteetVisitor();;
	
	private String nimi;
	private int taso;
	
	public Pokemon() {
		
		this.state = new Squirtle(this);
		this.taso = 1;
		this.nimi = "";
		
	}
	
	
	
	public void kehity(State state) {
		this.state = state;
	}
	
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public void setTaso(int taso) {
		this.taso = taso;
	}
	
	public String getNimi() {
		return nimi;
	}
	
	public int getTaso() {
		return taso;
	}
	
	public void nostaTasoa() {
		this.taso++;
	}

}
