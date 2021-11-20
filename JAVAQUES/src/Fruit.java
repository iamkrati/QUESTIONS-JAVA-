public class Fruit {
    String name,taste;
    int size;
    public void eat(){

    }
}
class Apple extends Fruit{
    @Override
    public void eat() {
        name="apple";
        taste="bitter";
        System.out.println("name="+name+" taste="+taste);
    }
}
class Orange extends Fruit{
    @Override
    public void eat() {
        name="orange";
        taste="sweet";
        System.out.println("name="+name+" taste="+taste);
    }
}
class FruitMain{
    public static void main(String[] args) {
        Apple obj1=new Apple();
        obj1.eat();
        Orange obj2=new Orange();
        obj2.eat();
    }
}
