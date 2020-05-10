package raytracer;

public class Main {
	public static void main(String [] args) throws Exception {
		String file1 = "./resources/foo.xml"; // path to foo.xml

		XMLParser docXML1 = new XMLParser(file1);
		docXML1.parse();

		PrettyPrintParser docPPP1 = new PrettyPrintParser(file1);
		docPPP1.parse();

		String file2 = "./resources/scene.x3d"; // path to scene.x3d

		XMLParser docXML2 = new XMLParser(file2);
		docXML2.parse();

		PrettyPrintParser docPPP2 = new PrettyPrintParser(file2);
		docPPP2.parse();

		String file3 = "./resources/test1.x3d"; // path to test1.x3d

		XMLParser docXML3 = new XMLParser(file3);
		docXML3.parse();

		PrettyPrintParser docPPP3 = new PrettyPrintParser(file3);
		docPPP3.parse();

		String file4 = "./resources/test2.x3d"; // path to test2.x3d

		XMLParser docXML4 = new XMLParser(file4);
		docXML4.parse();

		PrettyPrintParser docPPP4 = new PrettyPrintParser(file4);
		docPPP4.parse();
		
		String file5 = "./resources/test3.x3d"; // path to test3.x3d

		XMLParser docXML5 = new XMLParser(file5);
		docXML5.parse();

		PrettyPrintParser docPPP5 = new PrettyPrintParser(file5);
		docPPP5.parse();
	}
}
