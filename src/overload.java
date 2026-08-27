public class overload{
    void details(String name){
        System.out.println("name: "+name);
        System.out.println("************************");
    }
    void details(String name,String cource){
        System.out.print("name: "+name);
        System.out.println(" cource: "+cource);
        System.out.println("************************");
    }
    void details(String name,String cource,String degree){
        System.out.print("name: "+name);
        System.out.print(" cource: "+cource);
        System.out.println(" degree: "+degree);
        System.out.println("************************");
    }
    public static void main(String[] args){
        overload obj=new overload();
        obj.details("Ajith");
        obj.details("simbu","BE");
        obj.details("Harish","BE","ECE");
    }
}