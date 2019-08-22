package practice03;

import practice02.Person;

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
		return "I am a Student. I am at Class "+ klass +".";
	}
	
	public int getKlass() {
        return klass;
    }

    public void setKlass(int age) {
        this.klass = klass;
    }
}
