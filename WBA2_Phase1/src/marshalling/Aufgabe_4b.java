package marshalling;

import java.io.FileInputStream;
import javax.xml.bind.*;
import generated.*;


public class Aufgabe_4b{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

        JAXBContext jc = JAXBContext.newInstance(Rezepte.class);
        Unmarshaller um = jc.createUnmarshaller();

        generated.Rezepte r = (Rezepte) um.unmarshal(new FileInputStream("src/Aufgabe_3a.xml"));

        System.out.println("Rezepte:");
        for (Rezepte.Rezept rez:r.getRezept()){
//            System.out.println("ID: " + rez.getId());
            System.out.println("Titel: " + rez.);
            System.out.println("Autor: " + );
            System.out.println("Bild: " + );
            System.out.println("Datum: " + );
            System.out.println("Zutaten: " + );
            System.out.println("Zubereitung: " + );
            System.out.println("Kommentare: " + rez.Kommentare.Kommentar.class);
            System.out.println();
        }

	}

}
