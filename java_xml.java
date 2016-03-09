

public class java_xml {
    public static void main(String args[]){
	System.out.println("tes");
Document document= DocumentBuilderFactory
                          .newInstance()
                          .newDocumentBuilder()
    .parse(new File("helloWorld.xml"));
    }
}
