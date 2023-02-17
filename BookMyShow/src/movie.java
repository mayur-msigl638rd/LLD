
public class movie {
	
private String name;
private float ratings = 0.0f;

private language lang;
private genre gen;

public movie(String name, language lang, genre gen) {
	super();
	this.name = name;
	this.lang = lang;
	this.gen = gen;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getRatings() {
	return ratings;
}

public void setRatings(float ratings) {
	this.ratings = ratings;
}

public language getLang() {
	return lang;
}

public void setLang(language lang) {
	this.lang = lang;
}

public genre getGen() {
	return gen;
}

public void setGen(genre gen) {
	this.gen = gen;
}




}
