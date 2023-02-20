public class Less20 {
    public static void main(String[] a) {

    Human h1 = new Human("Bob",45);

    Human h2 = new Human("Tom",45);

    Human.description = "Nice";
    h1.getAll();
    h2.getAll();
    Human.description ="bad";
    h1.getAll();
    h2.getAll();


    }
}
class Human{
    private String name; // переменные объекта
    private int age;// переменные объекта

    public static String description;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void getAll(){
        System.out.println(name+ ","+age+","+ description );
    }
    public static void printAll(){
        System.out.println();
    }
}