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


public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		
		
		// Datei auswählen (XML)
		File datei = new File("/Users/Oli/git/WBA2_SS13_Oli/WBA2_Phase1/src/Aufgabe_3d.xml");
		
		
		// JAXB initiieren
        JAXBContext jc = JAXBContext.newInstance(Rezepte.class);
        // Marshaller + Unmarshaller 
        Unmarshaller um = jc.createUnmarshaller();
        Marshaller m = jc.createMarshaller();
        // Datei einlesen
        Rezepte rezepte = (Rezepte) um.unmarshal(datei);

        ausgeben(rezepte);
        
        
	}
	
	// XML to Java
	public static void ausgeben (Rezepte rezepte){
		
		// Rezeptausgabe
		for(int i=0;i<=rezepte.getRezept().size()-1;i++){
			
			// Ausgabe Daten
			System.out.println("Rezept: ");
			System.out.println("Titel: " + rezepte.getRezept().get(i).getTitel());
			System.out.println("Autor: " + rezepte.getRezept().get(i).getAutor());
			System.out.println("Datum: " + rezepte.getRezept().get(i).getDatum());
			System.out.println("Bild: " + rezepte.getRezept().get(i).getBild());
			System.out.println();
			System.out.println("Zutaten: ");
			
			// Zutatenausgabe
			for(int j=0;j<=rezepte.getRezept().get(i).getZutaten().getZutat().size()-1;j++){
				System.out.print(rezepte.getRezept().get(i).getZutaten().getZutat().get(j).getMenge() + " ");
				System.out.print(rezepte.getRezept().get(i).getZutaten().getZutat().get(j).getEinheit() + " ");
				System.out.println(rezepte.getRezept().get(i).getZutaten().getZutat().get(j).getName());
			}
			
			System.out.println();
			
			// Weitere Angaben
			System.out.println("Schwierigkeitsgrad: " + rezepte.getRezept().get(i).getZubereitung().getSchwierigkeitsgrad());
			System.out.print("Arbeitszeit: " + rezepte.getRezept().get(i).getZubereitung().getArbeitszeit().getDauer());
			System.out.println(rezepte.getRezept().get(i).getZubereitung().getArbeitszeit().getEinheit());
			
			// Brennwert optional
			if(rezepte.getRezept().get(i).getZubereitung().getBrennwert()!=null){
				System.out.print("Brennwert: " + rezepte.getRezept().get(i).getZubereitung().getBrennwert().getAnzahl());
				System.out.println(rezepte.getRezept().get(i).getZubereitung().getBrennwert().getEinheit());	
			}
			
			// Schritte zusammengefasst
			System.out.println("Arbeitsschritte: " + rezepte.getRezept().get(i).getZubereitung().getArbeitsschritte());
			
			// Ausgabe Kommentare
			System.out.println("Kommentare: ");
			for(int k=0;k<=rezepte.getRezept().get(i).getKommentare().getKommentar().size()-1;k++){
				System.out.println("Autor: " + rezepte.getRezept().get(i).getKommentare().getKommentar().get(k).getAutor());
				System.out.println("Datum: " + rezepte.getRezept().get(i).getKommentare().getKommentar().get(k).getDatum());
				System.out.println("Uhezti: " + rezepte.getRezept().get(i).getKommentare().getKommentar().get(k).getUhrzeit());
				System.out.println("Kommentar: " + rezepte.getRezept().get(i).getKommentare().getKommentar().get(k).getText());
				System.out.println();
			}
			System.out.println();
			
		}
		
		
		
		
	}
	
	
	
	
	
}
