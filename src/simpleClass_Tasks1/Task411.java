package simpleClass_Tasks1;
 //предложение
 class Phrase { 
	//значение предложения
    private String value="";
    //метод добавления слова
    public void addValue(Word word) {
        value += " " + word.getValue();
    }
    //метод получения значения
    public String getValue() {
        return value;
    }
}
 //слово
 class Word {
	//значение слова
    private String value;
  //конструктор
    public Word(String value) {
        this.value = value;
    }
  //метод получения значения
    public String getValue() {
        return value;
    }
}
 class Text {
	    private String header;
	    private String body = "";

	    public Text(Word word) {
	        header = word.getValue();
	    }

	    public Text(Phrase phrase) {
	        header = phrase.getValue();
	    }

	    public String getHeader() {
	        return header;
	    }

	    public void addBody(Word word) {
	        body += " " + word.getValue();
	    }

	    public void addBody(Phrase phrase) {
	        body += " " + phrase.getValue();
	    }

	    public String getBody() {
	        return body;
	    }
	}
public class Task411 {
	public static void main(String[] args) {
		 Word word = new Word("Приветствие");
	        Text text = new Text(word);
	        Word word1 = new Word(" Привет ");
	        Word word2 = new Word(" мир ");
	        Word word3 = new Word(" программирования! ");
	        Phrase phrase = new Phrase();
	        phrase.addValue(word1);
	        phrase.addValue(word2);
	        phrase.addValue(word3);
	        text.addBody(phrase);
	        System.out.println("Head: "+text.getHeader());
	        System.out.println("Body: "+text.getBody());
	}
}