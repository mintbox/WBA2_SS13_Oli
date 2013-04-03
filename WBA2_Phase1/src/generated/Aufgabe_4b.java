package generated;

import java.io.FileInputStream;
import javax.xml.bind.*;
import generated.ObjectFactory;
import generated.Rezepte;


public class Aufgabe_4b{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        JAXBContext jc = JAXBContext.newInstance(Rezepte.class);
        Unmarshaller um = jc.createUnmarshaller();

        Rezepte r = (Rezepte) um.unmarshal(new FileInputStream("src/Aufgabe_3a.xml"));

        System.out.println("Rezepte:");


	}

}
