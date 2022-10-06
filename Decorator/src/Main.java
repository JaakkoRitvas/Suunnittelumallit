
public class Main {
	
	public static void main(String[] args) {
		
		String tiedostonNimi = "salasana.txt";
		String salasana = "sumatehtavat06102022Decorator";
		
		// Tiedoston lukijan luominen
		DataSource source = new FileDataSource(tiedostonNimi);
		
		// Salasana kirjoitetaan tiedostoon
		source.writeData(salasana);
		
		// Salasana ilman salausta
		System.out.println("Alkuper�inen salasana: " + source.readData());
		
		// Luodaan decoraattori ja annetaan salasana
		
		DataSource ed = new EncryptionDecorator(source);
		ed.writeData(salasana);
		
		// Katsotaan onko tieto muuttunut
		System.out.println("Base64 salattu salasana: " + source.readData());
		
		// Palautetaan tieto alkuper�iseen muotoon
		System.out.println("Encoderilta suoraan: " + ed.readData());
		
		
	}

}