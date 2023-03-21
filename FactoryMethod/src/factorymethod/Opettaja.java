package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };

}

//"Esimerkkiohjelman Juoma luodaan AterioivanOtuksen Opettaja-aliluokassa. Juomanluontimetodi on tehdasmetodi. 
//Kirjoita Opettaja-luokalle kaksi rinnakkaista luokkaa, joissa kummassakin luodaan sopiva juoma.\n"
//+ "Luo testiohjelmassasi jokaista otustyyppiä oleva olio ja laita ne aterioimaan."//