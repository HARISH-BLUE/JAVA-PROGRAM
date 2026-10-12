class Person{
    private String name;
    private int age;
    public void setName(String s){
        this.name=s;
    }
    public void setAge(int n){
        this.age=n;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Samp extends Person{
    public void Display(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
    }
}
public class encapplusinherit {
    public static void main(String[] args){
        Samp m=new Samp();
        m.setName("Harish");
        m.setAge(21);
        m.Display();
    }    
}
