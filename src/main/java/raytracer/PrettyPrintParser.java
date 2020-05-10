package raytracer;

import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;

public class PrettyPrintParser extends XMLParser{

	public PrettyPrintParser(String fileName) {
		super(fileName);
	}
	
	@Override
	public void enter(StartElement startElement) {
		System.out.print("→");
		System.out.println(startElement.getName());
	}
	
	@Override
	public void exit(EndElement endElement) {
		System.out.print("←");
		System.out.println(endElement.getName());
	}
}
