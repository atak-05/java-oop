public class animal {
    public String name;
    public String color;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public animal(){
        this.age = 0;
        this.name ="default";
        this.color ="white";

    }

    public animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

}
