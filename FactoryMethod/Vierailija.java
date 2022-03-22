
public class Vierailija extends AterioivaOtus {
	
	public Juoma createJuoma(){
        return new Mehu();
    };
    
    public Ruoka createRuoka() {
    	return new Hampurilainen();
    };
}
