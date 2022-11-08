package statepackage;

public abstract class State {

	Pokemon pokemon;
	
	State(Pokemon pokemon){
		this.pokemon = pokemon;
	}
	
	//State vaihtuu
	public abstract void kehity();
	
	//Toimintoja mitä tekee
	public abstract void toiminta();
	
	public abstract void accept(Visitor v);
	
}
