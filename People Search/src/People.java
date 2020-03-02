
public class People {

	public int age;
	public String name;
	
	public People () {
		
	}
	
	public People(String nm, int a) {
		name = nm;
		age = a;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
