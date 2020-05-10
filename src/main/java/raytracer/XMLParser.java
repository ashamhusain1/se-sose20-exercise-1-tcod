package raytracer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

public class XMLParser {
	
	String fileName; // Name of the file.
	
	/**
	 * Constructor.
	 * @param fileName
	 */
	public XMLParser(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Method for printing the encountered opening tag.
	 * @param startElement
	 */
	public void enter(StartElement startElement) {
		System.out.println(startElement.getName());
	}

	/**
	 * Method for printing the encountered closing tag.
	 * @param endElement
	 */
	public void exit(EndElement endElement) {
		System.out.println(endElement.getName());
	}

	/**
	 * Method to parse through the file and search opening and closing tags.
	 * @throws FileNotFoundException
	 * @throws XMLStreamException
	 */
	public void parse() throws FileNotFoundException, XMLStreamException {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(this.fileName)); // Reads and handles the events.
		while (xmlEventReader.hasNext()) {
		    XMLEvent nextEvent = xmlEventReader.nextEvent();
		    if (nextEvent.isStartElement()) {
			    StartElement startElement = nextEvent.asStartElement();
			    this.enter(startElement);
			}
		    if (nextEvent.isEndElement()) {
		        EndElement endElement = nextEvent.asEndElement();
		        this.exit(endElement);
		    }
		}
	}
}
