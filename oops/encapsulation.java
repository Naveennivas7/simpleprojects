package oops;

public class encapsulation {
    private String name;
    private int age;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    public int getage() {
        return age;
    }

    public void setage(int a) {
        age = a;

    }
}

class demo {

    public static void main(String[] args) {

        encapsulation myobj = new encapsulation();

        myobj.setname("naveen");
        myobj.setage(22);
        System.out.println("name :" + myobj.getname());
        System.out.println("age :" + myobj.getage());

    }

}
