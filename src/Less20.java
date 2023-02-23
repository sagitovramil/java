public class Less20 {
    public static void main(String[] a) {

    Human h1 = new Human("Bob",45);
    Human h2 = new Human("Tom",45);
    h2.setName("fssdf");
        h1.printNumber();
        h2.printNumber();




    }
}
class Human{
    private String name; // переменные объекта
    private int age;// переменные объекта

    private static int countPeople;


    public Human(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public  void printNumber(){

        System.out.println("Number of people is " + countPeople);

    }
}