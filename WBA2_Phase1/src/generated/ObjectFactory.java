//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.02 um 04:17:55 PM CEST 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RezepteRezeptZubereitung_QNAME = new QName("", "zubereitung");
    private final static QName _RezepteRezeptAutor_QNAME = new QName("", "autor");
    private final static QName _RezepteRezeptTitel_QNAME = new QName("", "titel");
    private final static QName _RezepteRezeptKommentare_QNAME = new QName("", "kommentare");
    private final static QName _RezepteRezeptZutaten_QNAME = new QName("", "zutaten");
    private final static QName _RezepteRezeptBild_QNAME = new QName("", "bild");
    private final static QName _RezepteRezeptDatum_QNAME = new QName("", "datum");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rezepte }
     * 
     */
    public Rezepte createRezepte() {
        return new Rezepte();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept }
     * 
     */
    public Rezepte.Rezept createRezepteRezept() {
        return new Rezepte.Rezept();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Kommentare }
     * 
     */
    public Rezepte.Rezept.Kommentare createRezepteRezeptKommentare() {
        return new Rezepte.Rezept.Kommentare();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zutaten }
     * 
     */
    public Rezepte.Rezept.Zutaten createRezepteRezeptZutaten() {
        return new Rezepte.Rezept.Zutaten();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zutaten.Zutat }
     * 
     */
    public Rezepte.Rezept.Zutaten.Zutat createRezepteRezeptZutatenZutat() {
        return new Rezepte.Rezept.Zutaten.Zutat();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Bild }
     * 
     */
    public Rezepte.Rezept.Bild createRezepteRezeptBild() {
        return new Rezepte.Rezept.Bild();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung }
     * 
     */
    public Rezepte.Rezept.Zubereitung createRezepteRezeptZubereitung() {
        return new Rezepte.Rezept.Zubereitung();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Kommentare.Kommentar }
     * 
     */
    public Rezepte.Rezept.Kommentare.Kommentar createRezepteRezeptKommentareKommentar() {
        return new Rezepte.Rezept.Kommentare.Kommentar();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zutaten.Zutat.Menge }
     * 
     */
    public Rezepte.Rezept.Zutaten.Zutat.Menge createRezepteRezeptZutatenZutatMenge() {
        return new Rezepte.Rezept.Zutaten.Zutat.Menge();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rezepte.Rezept.Zubereitung }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zubereitung", scope = Rezepte.Rezept.class)
    public JAXBElement<Rezepte.Rezept.Zubereitung> createRezepteRezeptZubereitung(Rezepte.Rezept.Zubereitung value) {
        return new JAXBElement<Rezepte.Rezept.Zubereitung>(_RezepteRezeptZubereitung_QNAME, Rezepte.Rezept.Zubereitung.class, Rezepte.Rezept.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "autor", scope = Rezepte.Rezept.class)
    public JAXBElement<String> createRezepteRezeptAutor(String value) {
        return new JAXBElement<String>(_RezepteRezeptAutor_QNAME, String.class, Rezepte.Rezept.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "titel", scope = Rezepte.Rezept.class)
    public JAXBElement<String> createRezepteRezeptTitel(String value) {
        return new JAXBElement<String>(_RezepteRezeptTitel_QNAME, String.class, Rezepte.Rezept.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rezepte.Rezept.Kommentare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kommentare", scope = Rezepte.Rezept.class)
    public JAXBElement<Rezepte.Rezept.Kommentare> createRezepteRezeptKommentare(Rezepte.Rezept.Kommentare value) {
        return new JAXBElement<Rezepte.Rezept.Kommentare>(_RezepteRezeptKommentare_QNAME, Rezepte.Rezept.Kommentare.class, Rezepte.Rezept.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rezepte.Rezept.Zutaten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zutaten", scope = Rezepte.Rezept.class)
    public JAXBElement<Rezepte.Rezept.Zutaten> createRezepteRezeptZutaten(Rezepte.Rezept.Zutaten value) {
        return new JAXBElement<Rezepte.Rezept.Zutaten>(_RezepteRezeptZutaten_QNAME, Rezepte.Rezept.Zutaten.class, Rezepte.Rezept.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rezepte.Rezept.Bild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bild", scope = Rezepte.Rezept.class)
    public JAXBElement<Rezepte.Rezept.Bild> createRezepteRezeptBild(Rezepte.Rezept.Bild value) {
        return new JAXBElement<Rezepte.Rezept.Bild>(_RezepteRezeptBild_QNAME, Rezepte.Rezept.Bild.class, Rezepte.Rezept.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "datum", scope = Rezepte.Rezept.class)
    public JAXBElement<XMLGregorianCalendar> createRezepteRezeptDatum(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RezepteRezeptDatum_QNAME, XMLGregorianCalendar.class, Rezepte.Rezept.class, value);
    }

}
