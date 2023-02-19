public class Arrays {
    public static void main(String[] a){
        int mumber = 10;// примитивный тип двнных
        int[] numbers = new int[5];//массив ссылочный тип данных
        //System.out.println(numbers[0]);
        for (int i =0; i< numbers.length;i++){
            numbers[i] = i*10;
        }
        for (int i=0;i < numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3};
        for(int i = 0;i < numbers1.length; i++);
           // System.out.println(numbers1[i]);//необходимо вернутся и доделать
    }
}
