package kr.or.iei.model;

public class User {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private String phone;


	public User() {}
	
	public User(String id, String pwd, String name,
			int age, String phone) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	

		public void setId(String id) {
		this.id = id;

		}
		
		public String getId() {
			return id;

			}

	

		public void setPwd(String pwd) {
		this.pwd = pwd;

		}
		
		public String getPwd() {
			return pwd;

			}



		public void setName(String name) {
		this.name = name;

		}
		
		public String getName() {
		return name;

		}


		public void setAge(int age) {
		this.age = age;

		}
		
		public int getAge() {
			return age;

		}


		public void setPhone(String phone) {
		this.phone = phone;

		}
		
		public String getPhone() {
			return phone;

			}
		
		@Override
		public String toString() {
		return "id : " + id + ", pwd : " + pwd + ", name : " + name + ", age : " + age + ", phone : " + phone;

		}
		
}
