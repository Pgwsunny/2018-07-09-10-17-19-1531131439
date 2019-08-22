package practice05;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name,age);
    }

    public Worker() {
    }

    @Override
    public String introduce() {
    	String str = super.introduce();
        return str + " I am a Worker. I have a job.";
    }
}
