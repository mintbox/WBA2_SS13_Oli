package Aufgabe_4;

import java.awt.List;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import Aufgabe_4.Rezepte.Rezept;
import Aufgabe_4.Rezepte.Rezept.Kommentare;


public class Aufgabe_4b{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

        JAXBContext jc = JAXBContext.newInstance(Rezepte.class);
        Unmarshaller um = jc.createUnmarshaller();

        generated.Rezepte r = (Rezepte) um.unmarshal(new FileInputStream("src/Aufgabe_3a.xml"));

        System.out.println("Rezepte:");
//        for (Rezepte.Rezept rez:r.getRezept()){
//            System.out.println("ID: " + rez.getId());
            System.out.println("Titel: " + );
            System.out.println("Autor: " + );
            System.out.println("Bild: " + );
            System.out.println("Datum: " + );
            System.out.println("Zutaten: " + );
            System.out.println("Zubereitung: " + );
            System.out.println("Kommentare: " + );
            System.out.println();
  //      }

	}

}
