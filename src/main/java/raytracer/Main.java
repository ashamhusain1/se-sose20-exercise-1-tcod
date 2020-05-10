package raytracer;

import java.util.ArrayList;

public class Main {
	
	static final String PATH = "./resources/"; // Common prefix for the files.
	
	public static void main(String [] args) throws Exception {
		
		ArrayList<String> files = new ArrayList<String>();
		files.add("foo.xml");
		files.add("scene.x3d");
		files.add("test1.x3d");
		files.add("test2.x3d");
		files.add("test3.x3d");
		for (int i = 0; i < files.size(); i++) {
			String file = PATH + files.get(i); // Path to file.
			
			// Object of XMLParser class which can call the parse method.
			XMLParser docXML = new XMLParser(file);
			docXML.parse();
			
			// Object of PrettyPrintParser class which can call the parse method.
			PrettyPrintParser docPPP = new PrettyPrintParser(file);
			docPPP.parse();
		}
	}
}
