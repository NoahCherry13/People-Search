public class People implements Comparable<People>{

	public int age;
	public String name;
	
	public People () {
		age = 0;
		name = "";
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

	@Override
	public int compareTo(People o) {
		return getName().toLowerCase().compareTo(o.getName().toLowerCase());
	}
	
}
