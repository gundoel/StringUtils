
public class Main {
	public static void main (String [] args) {
		String myJSON;
		Codeblock myXML = new Codeblock ("<element>inhalt</element>", "xml");
		myJSON = myXML.transform(myXML,"xml", "json");
		System.out.println(myJSON);
	}
	
}
