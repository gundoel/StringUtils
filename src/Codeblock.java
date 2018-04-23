
public class Codeblock {
	String code;
	String language;
	
	// Constructor
	public Codeblock (String inputCode, String inputLanguage) {
		this.code = inputCode;
		this.language = inputLanguage;
	}

	public String transform(Codeblock inputCodeblock, String sourceLanguage, String targetLanguage) {
		String transformedCodeblock = "";
		if (sourceLanguage == "xml" && targetLanguage == "json") {
			transformedCodeblock = transform2JSON(inputCodeblock, targetLanguage);
			setLanguage(inputCodeblock, targetLanguage);
		}
		return transformedCodeblock;
	}
	
	public String transform2JSON(Codeblock inputCodeblock, String targetLanguage) {
		String outputCodeblock = "";
		String inputCode = inputCodeblock.code;
		elements[] = inputCode.split("/>")
		inputCode.s
	}
	
	public void setLanguage(Codeblock codeblock, String language) {
		codeblock.language = language;
	}
}
