public class Lesson19 {
    public static void main(String[] a){
        Human human1 = new Human();
        human1.setName("Tom");
        human1.setAge(18);
        human1.getInfo();

    }
}
class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;// обращение к полю и присваивание, this вызывает объект внутри класса
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name+","+age);
    }
}