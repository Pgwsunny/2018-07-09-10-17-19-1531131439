package practice06;

public class Teacher extends Person{
    private int klass;
    public Teacher(String name, int age, int klass){
        super(name,age);
        this.klass=klass;
    }

    public Teacher(String name, int age){
        super(name,age);
    }
    @Override
    public String introduce() {
        if(klass != 0){
        	System.out.println(super.introduce()+" I teach Class "+klass+".");
            return super.introduce()+" I am a Teacher. I teach Class "+klass+".";
        }else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }

    }
    public int getKlass() {
        return klass;
    }

    public void setKlass(int age) {
        this.klass = klass;
    }
}
