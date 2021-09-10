
public class student implements Comparable<student> {
	int no;
	String name;
	int age;
	
	@Override
	public int compareTo(student o) {
		return name.compareTo(o.name);
	}

	public student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
