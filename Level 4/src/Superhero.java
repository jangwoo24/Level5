
public class Superhero extends Character{
	String name = null;
	String superpower = null;
	boolean Evil = true;
	Superhero(String s, String t)  {
		super(s, true);
		name = s;
		superpower = t;
	}
	void setName(String s) {
		name = s;
	}
	String getName() {
		return name;
	}
	void setSuperpower(String s) {
		superpower = s;
	}
	String getSuperpower() {
		return superpower;
	}
	Superhero(String s, String t, boolean b) {
		super(s, b);
		name = s;
		superpower = t;
		Evil = b;
	}
	
}