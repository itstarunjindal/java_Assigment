package Constructors;

public class CopyConstructor {
    private String name;
    private int age;

    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    CopyConstructor(CopyConstructor obj){
        this.name = obj.name;
        this.age = obj.age;
    }
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor("Varun", 20);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        System.out.println(obj2.name);
    }
}
