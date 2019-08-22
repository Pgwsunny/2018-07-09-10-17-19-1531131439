package practice06;

import practice05.Person;

public class Student extends Person{
	private int klass;
	
	public Student(String name, int age) {
        super(name,age);
    }
	public Student(String name,int age,int klass) {
		super(name,age);
		this.klass=klass;
	}
	@Override
	public String introduce() {
		String str = super.introduce();
//		System.out.println(str+" I am a Student. I am at Class "+klass);
        return str+" I am a Student. I am at Class "+klass +".";
	}
	
	public int getKlass() {
        return klass;
    }

    public void setKlass(int age) {
        this.klass = klass;
    }
}

