package Student;

public class Student {
	static int serialNum = 1000;
	int id;
	String name;
	
	/*public Student() {
		serialNum++;
		id = serialNum;
	}*/
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

}
