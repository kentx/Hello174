package ken.week1901;
class Dog{
	int age;
	String name;
	String sex;
	public Dog(int age, String name, String sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	
}

public class DogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(new Dog(10, "Íú²Æ", "´Æ"));
	}

}
