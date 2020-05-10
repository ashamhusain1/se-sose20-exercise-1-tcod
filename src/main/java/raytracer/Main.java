package raytracer;

public class Main {
    public static void main(String [] args) throws Exception {
        String file = "./resources/foo.xml"; // path to foo.xml
        
        XMLParser docXML = new XMLParser(file);
        docXML.parse();
        
        PrettyPrintParser docPPP = new PrettyPrintParser(file);
        docPPP.parse();
    }
}
