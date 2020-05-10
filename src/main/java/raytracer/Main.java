package raytracer;

import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;

public class PrettyPrintParser extends XMLParser{
	
	private int depth = 0; // Depth of indentation

	/**
	 * Constructor.
	 * @param fileName
	 */
	public PrettyPrintParser(String fileName) {
		super(fileName);
	}
	
	@Override
	public void enter(StartElement startElement) {
		for (int i = 0; i < this.depth; i++) {
			System.out.print("    "); // Printing a tab space for indentation.
		}
		System.out.print("→");
		System.out.println(startElement.getName());
		this.depth++; // Incrementing the depth.
	}
	
	@Override
	public void exit(EndElement endElement) {
		this.depth--; // Decrementing the depth.
		for (int i = 0; i < this.depth; i++) {
			System.out.print("    "); // Printing a tab space for indentation.
		}
		System.out.print("←");
		System.out.println(endElement.getName());
	}
}
