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
	
	String fileName;
	
	public XMLParser(String fileName) {
		this.fileName = fileName;
	}

	public void enter(StartElement startElement) {
		//TODO Implementation
	}

	public void exit(EndElement endElement) {
		//TODO Implementation
		
	}

	public void parse() throws FileNotFoundException, XMLStreamException {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(this.fileName));
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
