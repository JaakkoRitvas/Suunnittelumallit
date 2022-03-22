

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus vierailija = new Vierailija();
        opettaja.aterioi();
        vierailija.aterioi();
        oppilas.aterioi();
    }
}
