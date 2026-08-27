public class method {
    static String companyname="wipro";
    static void companydetails(){
        System.out.println("companyname:"+companyname);
        System.out.println("location : chennai");
        System.out.println("Domain : software testing");
    }
    public static void main(String[] args){
        System.out.println("employee information");
        System.out.println("---------------------");
        companydetails();
        System.out.println("----------------------");
        companyname="infosys";
        companydetails();
        System.out.println("-----------------------");
    }
}
