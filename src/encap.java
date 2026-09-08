public class encap {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        encap e = new encap();
        e.setName("Raj");
        e.setAge(20);

        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
    }
}
