package colLesson01;

public class Word{
	private String english;
	private String japanese;


	/**
	 * @return english
	 */
	public String getEnglish() {
		return english;
	}

	/**
	 * @param english セットする english
	 */
	public void setEnglish(String english) {
		this.english = english;
	}

	/**
	 * @return japanese
	 */
	public String getJapanese() {
		return japanese;
	}

	/**
	 * @param japanese セットする japanese
	 */
	public void setJapanese(String japanese) {
		this.japanese = japanese;
	}

	public Word(){
	}

	public Word(String english, String japanese){
		this.english = english;
		this.japanese = japanese;
	}



}