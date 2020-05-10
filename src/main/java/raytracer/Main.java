package raytracer;

import java.util.ArrayList;

public class Main {
	
	static final String PATH = "./resources/";
	
	public static void main(String [] args) throws Exception {
		
		ArrayList<String> files = new ArrayList<String>();
		files.add("foo.xml");
		files.add("scene.x3d");
		files.add("test1.x3d");
		files.add("test2.x3d");
		files.add("test3.x3d");
		for (int i = 0; i < files.size(); i++) {
			String file = PATH + files.get(i); // path to file

			XMLParser docXML = new XMLParser(file);
			docXML.parse();

			PrettyPrintParser docPPP = new PrettyPrintParser(file);
			docPPP.parse();
		}
	}
}
