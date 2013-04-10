//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2013.04.08 um 08:13:47 PM CEST
//


package Aufgabe_4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Rezept" maxOccurs="unbounded">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 * &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 * &lt;element name="Zutaten">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Zutat" maxOccurs="unbounded">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;element name="Menge" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="Einheit" default="g">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="g"/>
 * &lt;enumeration value="Pck."/>
 * &lt;enumeration value="EL"/>
 * &lt;enumeration value="ml"/>
 * &lt;enumeration value="Prise"/>
 * &lt;enumeration value="Dose"/>
 * &lt;enumeration value="TL"/>
 * &lt;enumeration value="Pkt."/>
 * &lt;enumeration value="Stk."/>
 * &lt;enumeration value="Flasche"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/attribute>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="Zubereitung">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Arbeitszeit">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 * &lt;/sequence>
 * &lt;attribute name="Einheit">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="std"/>
 * &lt;enumeration value="min"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/attribute>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="Ruhezeit" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 * &lt;/sequence>
 * &lt;attribute name="Einheit">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="std"/>
 * &lt;enumeration value="min"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/attribute>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="Schwierigkeitsgrad">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="simpel"/>
 * &lt;enumeration value="normal"/>
 * &lt;enumeration value="pfiffig"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/element>
 * &lt;element name="Brennwert" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Anzahl" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 * &lt;/sequence>
 * &lt;attribute name="Einheit">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="kcal"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/attribute>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="Arbeitsschritte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="Kommentare" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="Kommentar" maxOccurs="unbounded" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;attribute name="Autor" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}date" />
 * &lt;attribute name="Uhrzeit" type="{http://www.w3.org/2001/XMLSchema}time" />
 * &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "rezept"
})
@XmlRootElement(name = "Rezepte")
public class Rezepte {

    @XmlElement(name = "Rezept", required = true)
    protected List<Rezepte.Rezept> rezept;

    /**
     * Gets the value of the rezept property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rezept property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getRezept().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rezepte.Rezept }
     *
     *
     */
    public List<Rezepte.Rezept> getRezept() {
        if (rezept == null) {
            rezept = new ArrayList<Rezepte.Rezept>();
        }
        return this.rezept;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     * &lt;element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     * &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
     * &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     * &lt;element name="Zutaten">
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="Zutat" maxOccurs="unbounded">
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     * &lt;element name="Menge" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;attribute name="Einheit" default="g">
     * &lt;simpleType>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     * &lt;enumeration value="g"/>
     * &lt;enumeration value="Pck."/>
     * &lt;enumeration value="EL"/>
     * &lt;enumeration value="ml"/>
     * &lt;enumeration value="Prise"/>
     * &lt;enumeration value="Dose"/>
     * &lt;enumeration value="TL"/>
     * &lt;enumeration value="Pkt."/>
     * &lt;enumeration value="Stk."/>
     * &lt;enumeration value="Flasche"/>
     * &lt;/restriction>
     * &lt;/simpleType>
     * &lt;/attribute>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * &lt;/element>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * &lt;/element>
     * &lt;element name="Zubereitung">
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="Arbeitszeit">
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     * &lt;/sequence>
     * &lt;attribute name="Einheit">
     * &lt;simpleType>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     * &lt;enumeration value="std"/>
     * &lt;enumeration value="min"/>
     * &lt;/restriction>
     * &lt;/simpleType>
     * &lt;/attribute>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * &lt;/element>
     * &lt;element name="Ruhezeit" minOccurs="0">
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     * &lt;/sequence>
     * &lt;attribute name="Einheit">
     * &lt;simpleType>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     * &lt;enumeration value="std"/>
     * &lt;enumeration value="min"/>
     * &lt;/restriction>
     * &lt;/simpleType>
     * &lt;/attribute>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * &lt;/element>
     * &lt;element name="Schwierigkeitsgrad">
     * &lt;simpleType>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     * &lt;enumeration value="simpel"/>
     * &lt;enumeration value="normal"/>
     * &lt;enumeration value="pfiffig"/>
     * &lt;/restriction>
     * &lt;/simpleType>
     * &lt;/element>
     * &lt;element name="Brennwert" minOccurs="0">
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="Anzahl" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     * &lt;/sequence>
     * &lt;attribute name="Einheit">
     * &lt;simpleType>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     * &lt;enumeration value="kcal"/>
     * &lt;/restriction>
     * &lt;/simpleType>
     * &lt;/attribute>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * &lt;/element>
     * &lt;element name="Arbeitsschritte" type="{http://www.w3.org/2001/XMLSchema}string"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * &lt;/element>
     * &lt;element name="Kommentare" minOccurs="0">
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="Kommentar" maxOccurs="unbounded" minOccurs="0">
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;attribute name="Autor" type="{http://www.w3.org/2001/XMLSchema}string" />
     * &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}date" />
     * &lt;attribute name="Uhrzeit" type="{http://www.w3.org/2001/XMLSchema}time" />
     * &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * &lt;/element>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * &lt;/element>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "titel",
            "autor",
            "datum",
            "bild",
            "zutaten",
            "zubereitung",
            "kommentare"
    })
    public static class Rezept {

        @XmlElement(name = "Titel", required = true)
        protected String titel;
        @XmlElement(name = "Autor", required = true)
        protected String autor;
        @XmlElement(name = "Datum", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datum;
        @XmlElement(name = "Bild")
        @XmlSchemaType(name = "anyURI")
        protected String bild;
        @XmlElement(name = "Zutaten", required = true)
        protected Rezepte.Rezept.Zutaten zutaten;
        @XmlElement(name = "Zubereitung", required = true)
        protected Rezepte.Rezept.Zubereitung zubereitung;
        @XmlElement(name = "Kommentare")
        protected Rezepte.Rezept.Kommentare kommentare;

        /**
         * Ruft den Wert der titel-Eigenschaft ab.
         *
         * @return
         * possible object is
         * {@link String }
         *
         */
        public String getTitel() {
            return titel;
        }

        /**
         * Legt den Wert der titel-Eigenschaft fest.
         *
         * @param value
         * allowed object is
         * {@link String }
         *
         */
        public void setTitel(String value) {
            this.titel = value;
        }

        /**
         * Ruft den Wert der autor-Eigenschaft ab.
         *
         * @return
         * possible object is
         * {@link String }
         *
         */
        public String getAutor() {
            return autor;
        }

        /**
         * Legt den Wert der autor-Eigenschaft fest.
         *
         * @param value
         * allowed object is
         * {@link String }
         *
         */
        public void setAutor(String value) {
            this.autor = value;
        }

        /**
         * Ruft den Wert der datum-Eigenschaft ab.
         *
         * @return
         * possible object is
         * {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getDatum() {
            return datum;
        }

        /**
         * Legt den Wert der datum-Eigenschaft fest.
         *
         * @param value
         * allowed object is
         * {@link XMLGregorianCalendar }
         *
         */
        public void setDatum(XMLGregorianCalendar value) {
            this.datum = value;
        }

        /**
         * Ruft den Wert der bild-Eigenschaft ab.
         *
         * @return
         * possible object is
         * {@link String }
         *
         */
        public String getBild() {
            return bild;
        }

        /**
         * Legt den Wert der bild-Eigenschaft fest.
         *
         * @param value
         * allowed object is
         * {@link String }
         *
         */
        public void setBild(String value) {
            this.bild = value;
        }

        /**
         * Ruft den Wert der zutaten-Eigenschaft ab.
         *
         * @return
         * possible object is
         * {@link Rezepte.Rezept.Zutaten }
         *
         */
        public Rezepte.Rezept.Zutaten getZutaten() {
            return zutaten;
        }

        /**
         * Legt den Wert der zutaten-Eigenschaft fest.
         *
         * @param value
         * allowed object is
         * {@link Rezepte.Rezept.Zutaten }
         *
         */
        public void setZutaten(Rezepte.Rezept.Zutaten value) {
            this.zutaten = value;
        }

        /**
         * Ruft den Wert der zubereitung-Eigenschaft ab.
         *
         * @return
         * possible object is
         * {@link Rezepte.Rezept.Zubereitung }
         *
         */
        public Rezepte.Rezept.Zubereitung getZubereitung() {
            return zubereitung;
        }

        /**
         * Legt den Wert der zubereitung-Eigenschaft fest.
         *
         * @param value
         * allowed object is
         * {@link Rezepte.Rezept.Zubereitung }
         *
         */
        public void setZubereitung(Rezepte.Rezept.Zubereitung value) {
            this.zubereitung = value;
        }

        /**
         * Ruft den Wert der kommentare-Eigenschaft ab.
         *
         * @return
         * possible object is
         * {@link Rezepte.Rezept.Kommentare }
         *
         */
        public Rezepte.Rezept.Kommentare getKommentare() {
            return kommentare;
        }

        /**
         * Legt den Wert der kommentare-Eigenschaft fest.
         *
         * @param value
         * allowed object is
         * {@link Rezepte.Rezept.Kommentare }
         *
         */
        public void setKommentare(Rezepte.Rezept.Kommentare value) {
            this.kommentare = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         *
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         *
         * <pre>
         * &lt;complexType>
         * &lt;complexContent>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         * &lt;sequence>
         * &lt;element name="Kommentar" maxOccurs="unbounded" minOccurs="0">
         * &lt;complexType>
         * &lt;complexContent>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         * &lt;attribute name="Autor" type="{http://www.w3.org/2001/XMLSchema}string" />
         * &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}date" />
         * &lt;attribute name="Uhrzeit" type="{http://www.w3.org/2001/XMLSchema}time" />
         * &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         * &lt;/restriction>
         * &lt;/complexContent>
         * &lt;/complexType>
         * &lt;/element>
         * &lt;/sequence>
         * &lt;/restriction>
         * &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "kommentar"
        })
        public static class Kommentare {

            @XmlElement(name = "Kommentar")
            protected List<Rezepte.Rezept.Kommentare.Kommentar> kommentar;

            /**
             * Gets the value of the kommentar property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kommentar property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             * getKommentar().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Kommentare.Kommentar }
             *
             *
             */
            public List<Rezepte.Rezept.Kommentare.Kommentar> getKommentar() {
                if (kommentar == null) {
                    kommentar = new ArrayList<Rezepte.Rezept.Kommentare.Kommentar>();
                }
                return this.kommentar;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             *
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             *
             * <pre>
             * &lt;complexType>
             * &lt;complexContent>
             * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             * &lt;attribute name="Autor" type="{http://www.w3.org/2001/XMLSchema}string" />
             * &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}date" />
             * &lt;attribute name="Uhrzeit" type="{http://www.w3.org/2001/XMLSchema}time" />
             * &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
             * &lt;/restriction>
             * &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Kommentar {

                @XmlAttribute(name = "Autor")
                protected String autor;
                @XmlAttribute(name = "Datum")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar datum;
                @XmlAttribute(name = "Uhrzeit")
                @XmlSchemaType(name = "time")
                protected XMLGregorianCalendar uhrzeit;
                @XmlAttribute(name = "Text")
                protected String text;

                /**
                 * Ruft den Wert der autor-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link String }
                 *
                 */
                public String getAutor() {
                    return autor;
                }

                /**
                 * Legt den Wert der autor-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link String }
                 *
                 */
                public void setAutor(String value) {
                    this.autor = value;
                }

                /**
                 * Ruft den Wert der datum-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getDatum() {
                    return datum;
                }

                /**
                 * Legt den Wert der datum-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link XMLGregorianCalendar }
                 *
                 */
                public void setDatum(XMLGregorianCalendar value) {
                    this.datum = value;
                }

                /**
                 * Ruft den Wert der uhrzeit-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getUhrzeit() {
                    return uhrzeit;
                }

                /**
                 * Legt den Wert der uhrzeit-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link XMLGregorianCalendar }
                 *
                 */
                public void setUhrzeit(XMLGregorianCalendar value) {
                    this.uhrzeit = value;
                }

                /**
                 * Ruft den Wert der text-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link String }
                 *
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Legt den Wert der text-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link String }
                 *
                 */
                public void setText(String value) {
                    this.text = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         *
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         *
         * <pre>
         * &lt;complexType>
         * &lt;complexContent>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         * &lt;sequence>
         * &lt;element name="Arbeitszeit">
         * &lt;complexType>
         * &lt;complexContent>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         * &lt;sequence>
         * &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         * &lt;/sequence>
         * &lt;attribute name="Einheit">
         * &lt;simpleType>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         * &lt;enumeration value="std"/>
         * &lt;enumeration value="min"/>
         * &lt;/restriction>
         * &lt;/simpleType>
         * &lt;/attribute>
         * &lt;/restriction>
         * &lt;/complexContent>
         * &lt;/complexType>
         * &lt;/element>
         * &lt;element name="Ruhezeit" minOccurs="0">
         * &lt;complexType>
         * &lt;complexContent>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         * &lt;sequence>
         * &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         * &lt;/sequence>
         * &lt;attribute name="Einheit">
         * &lt;simpleType>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         * &lt;enumeration value="std"/>
         * &lt;enumeration value="min"/>
         * &lt;/restriction>
         * &lt;/simpleType>
         * &lt;/attribute>
         * &lt;/restriction>
         * &lt;/complexContent>
         * &lt;/complexType>
         * &lt;/element>
         * &lt;element name="Schwierigkeitsgrad">
         * &lt;simpleType>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         * &lt;enumeration value="simpel"/>
         * &lt;enumeration value="normal"/>
         * &lt;enumeration value="pfiffig"/>
         * &lt;/restriction>
         * &lt;/simpleType>
         * &lt;/element>
         * &lt;element name="Brennwert" minOccurs="0">
         * &lt;complexType>
         * &lt;complexContent>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         * &lt;sequence>
         * &lt;element name="Anzahl" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         * &lt;/sequence>
         * &lt;attribute name="Einheit">
         * &lt;simpleType>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         * &lt;enumeration value="kcal"/>
         * &lt;/restriction>
         * &lt;/simpleType>
         * &lt;/attribute>
         * &lt;/restriction>
         * &lt;/complexContent>
         * &lt;/complexType>
         * &lt;/element>
         * &lt;element name="Arbeitsschritte" type="{http://www.w3.org/2001/XMLSchema}string"/>
         * &lt;/sequence>
         * &lt;/restriction>
         * &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "arbeitszeit",
                "ruhezeit",
                "schwierigkeitsgrad",
                "brennwert",
                "arbeitsschritte"
        })
        public static class Zubereitung {

            @XmlElement(name = "Arbeitszeit", required = true)
            protected Rezepte.Rezept.Zubereitung.Arbeitszeit arbeitszeit;
            @XmlElement(name = "Ruhezeit")
            protected Rezepte.Rezept.Zubereitung.Ruhezeit ruhezeit;
            @XmlElement(name = "Schwierigkeitsgrad", required = true)
            protected String schwierigkeitsgrad;
            @XmlElement(name = "Brennwert")
            protected Rezepte.Rezept.Zubereitung.Brennwert brennwert;
            @XmlElement(name = "Arbeitsschritte", required = true)
            protected String arbeitsschritte;

            /**
             * Ruft den Wert der arbeitszeit-Eigenschaft ab.
             *
             * @return
             * possible object is
             * {@link Rezepte.Rezept.Zubereitung.Arbeitszeit }
             *
             */
            public Rezepte.Rezept.Zubereitung.Arbeitszeit getArbeitszeit() {
                return arbeitszeit;
            }

            /**
             * Legt den Wert der arbeitszeit-Eigenschaft fest.
             *
             * @param value
             * allowed object is
             * {@link Rezepte.Rezept.Zubereitung.Arbeitszeit }
             *
             */
            public void setArbeitszeit(Rezepte.Rezept.Zubereitung.Arbeitszeit value) {
                this.arbeitszeit = value;
            }

            /**
             * Ruft den Wert der ruhezeit-Eigenschaft ab.
             *
             * @return
             * possible object is
             * {@link Rezepte.Rezept.Zubereitung.Ruhezeit }
             *
             */
            public Rezepte.Rezept.Zubereitung.Ruhezeit getRuhezeit() {
                return ruhezeit;
            }

            /**
             * Legt den Wert der ruhezeit-Eigenschaft fest.
             *
             * @param value
             * allowed object is
             * {@link Rezepte.Rezept.Zubereitung.Ruhezeit }
             *
             */
            public void setRuhezeit(Rezepte.Rezept.Zubereitung.Ruhezeit value) {
                this.ruhezeit = value;
            }

            /**
             * Ruft den Wert der schwierigkeitsgrad-Eigenschaft ab.
             *
             * @return
             * possible object is
             * {@link String }
             *
             */
            public String getSchwierigkeitsgrad() {
                return schwierigkeitsgrad;
            }

            /**
             * Legt den Wert der schwierigkeitsgrad-Eigenschaft fest.
             *
             * @param value
             * allowed object is
             * {@link String }
             *
             */
            public void setSchwierigkeitsgrad(String value) {
                this.schwierigkeitsgrad = value;
            }

            /**
             * Ruft den Wert der brennwert-Eigenschaft ab.
             *
             * @return
             * possible object is
             * {@link Rezepte.Rezept.Zubereitung.Brennwert }
             *
             */
            public Rezepte.Rezept.Zubereitung.Brennwert getBrennwert() {
                return brennwert;
            }

            /**
             * Legt den Wert der brennwert-Eigenschaft fest.
             *
             * @param value
             * allowed object is
             * {@link Rezepte.Rezept.Zubereitung.Brennwert }
             *
             */
            public void setBrennwert(Rezepte.Rezept.Zubereitung.Brennwert value) {
                this.brennwert = value;
            }

            /**
             * Ruft den Wert der arbeitsschritte-Eigenschaft ab.
             *
             * @return
             * possible object is
             * {@link String }
             *
             */
            public String getArbeitsschritte() {
                return arbeitsschritte;
            }

            /**
             * Legt den Wert der arbeitsschritte-Eigenschaft fest.
             *
             * @param value
             * allowed object is
             * {@link String }
             *
             */
            public void setArbeitsschritte(String value) {
                this.arbeitsschritte = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             *
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             *
             * <pre>
             * &lt;complexType>
             * &lt;complexContent>
             * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             * &lt;sequence>
             * &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             * &lt;/sequence>
             * &lt;attribute name="Einheit">
             * &lt;simpleType>
             * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             * &lt;enumeration value="std"/>
             * &lt;enumeration value="min"/>
             * &lt;/restriction>
             * &lt;/simpleType>
             * &lt;/attribute>
             * &lt;/restriction>
             * &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "dauer"
            })
            public static class Arbeitszeit {

                @XmlElement(name = "Dauer", required = true)
                protected BigInteger dauer;
                @XmlAttribute(name = "Einheit")
                protected String einheit;

                /**
                 * Ruft den Wert der dauer-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link BigInteger }
                 *
                 */
                public BigInteger getDauer() {
                    return dauer;
                }

                /**
                 * Legt den Wert der dauer-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link BigInteger }
                 *
                 */
                public void setDauer(BigInteger value) {
                    this.dauer = value;
                }

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link String }
                 *
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link String }
                 *
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             *
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             *
             * <pre>
             * &lt;complexType>
             * &lt;complexContent>
             * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             * &lt;sequence>
             * &lt;element name="Anzahl" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             * &lt;/sequence>
             * &lt;attribute name="Einheit">
             * &lt;simpleType>
             * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             * &lt;enumeration value="kcal"/>
             * &lt;/restriction>
             * &lt;/simpleType>
             * &lt;/attribute>
             * &lt;/restriction>
             * &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "anzahl"
            })
            public static class Brennwert {

                @XmlElement(name = "Anzahl", required = true)
                protected BigInteger anzahl;
                @XmlAttribute(name = "Einheit")
                protected String einheit;

                /**
                 * Ruft den Wert der anzahl-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link BigInteger }
                 *
                 */
                public BigInteger getAnzahl() {
                    return anzahl;
                }

                /**
                 * Legt den Wert der anzahl-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link BigInteger }
                 *
                 */
                public void setAnzahl(BigInteger value) {
                    this.anzahl = value;
                }

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link String }
                 *
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link String }
                 *
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             *
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             *
             * <pre>
             * &lt;complexType>
             * &lt;complexContent>
             * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             * &lt;sequence>
             * &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             * &lt;/sequence>
             * &lt;attribute name="Einheit">
             * &lt;simpleType>
             * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             * &lt;enumeration value="std"/>
             * &lt;enumeration value="min"/>
             * &lt;/restriction>
             * &lt;/simpleType>
             * &lt;/attribute>
             * &lt;/restriction>
             * &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "dauer"
            })
            public static class Ruhezeit {

                @XmlElement(name = "Dauer", required = true)
                protected BigInteger dauer;
                @XmlAttribute(name = "Einheit")
                protected String einheit;

                /**
                 * Ruft den Wert der dauer-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link BigInteger }
                 *
                 */
                public BigInteger getDauer() {
                    return dauer;
                }

                /**
                 * Legt den Wert der dauer-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link BigInteger }
                 *
                 */
                public void setDauer(BigInteger value) {
                    this.dauer = value;
                }

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link String }
                 *
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link String }
                 *
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         *
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         *
         * <pre>
         * &lt;complexType>
         * &lt;complexContent>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         * &lt;sequence>
         * &lt;element name="Zutat" maxOccurs="unbounded">
         * &lt;complexType>
         * &lt;complexContent>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         * &lt;sequence>
         * &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         * &lt;element name="Menge" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
         * &lt;/sequence>
         * &lt;attribute name="Einheit" default="g">
         * &lt;simpleType>
         * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         * &lt;enumeration value="g"/>
         * &lt;enumeration value="Pck."/>
         * &lt;enumeration value="EL"/>
         * &lt;enumeration value="ml"/>
         * &lt;enumeration value="Prise"/>
         * &lt;enumeration value="Dose"/>
         * &lt;enumeration value="TL"/>
         * &lt;enumeration value="Pkt."/>
         * &lt;enumeration value="Stk."/>
         * &lt;enumeration value="Flasche"/>
         * &lt;/restriction>
         * &lt;/simpleType>
         * &lt;/attribute>
         * &lt;/restriction>
         * &lt;/complexContent>
         * &lt;/complexType>
         * &lt;/element>
         * &lt;/sequence>
         * &lt;/restriction>
         * &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "zutat"
        })
        public static class Zutaten {

            @XmlElement(name = "Zutat", required = true)
            protected List<Rezepte.Rezept.Zutaten.Zutat> zutat;

            /**
             * Gets the value of the zutat property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the zutat property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             * getZutat().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Zutaten.Zutat }
             *
             *
             */
            public List<Rezepte.Rezept.Zutaten.Zutat> getZutat() {
                if (zutat == null) {
                    zutat = new ArrayList<Rezepte.Rezept.Zutaten.Zutat>();
                }
                return this.zutat;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             *
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             *
             * <pre>
             * &lt;complexType>
             * &lt;complexContent>
             * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             * &lt;sequence>
             * &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             * &lt;element name="Menge" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
             * &lt;/sequence>
             * &lt;attribute name="Einheit" default="g">
             * &lt;simpleType>
             * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             * &lt;enumeration value="g"/>
             * &lt;enumeration value="Pck."/>
             * &lt;enumeration value="EL"/>
             * &lt;enumeration value="ml"/>
             * &lt;enumeration value="Prise"/>
             * &lt;enumeration value="Dose"/>
             * &lt;enumeration value="TL"/>
             * &lt;enumeration value="Pkt."/>
             * &lt;enumeration value="Stk."/>
             * &lt;enumeration value="Flasche"/>
             * &lt;/restriction>
             * &lt;/simpleType>
             * &lt;/attribute>
             * &lt;/restriction>
             * &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "name",
                    "menge"
            })
            public static class Zutat {

                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlElement(name = "Menge")
                protected Float menge;
                @XmlAttribute(name = "Einheit")
                protected String einheit;

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Ruft den Wert der menge-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link Float }
                 *
                 */
                public Float getMenge() {
                    return menge;
                }

                /**
                 * Legt den Wert der menge-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link Float }
                 *
                 */
                public void setMenge(Float value) {
                    this.menge = value;
                }

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 *
                 * @return
                 * possible object is
                 * {@link String }
                 *
                 */
                public String getEinheit() {
                    if (einheit == null) {
                        return "g";
                    } else {
                        return einheit;
                    }
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 *
                 * @param value
                 * allowed object is
                 * {@link String }
                 *
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

            }

        }

    }

}