public class Break_Contine {
    public static void main(String[] args) {
       /* int i= 0;
        while (true){
            if (i==12){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("мы вышли из цикла");
    }*/
        for(int i = 0; i <= 15; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("это нечетное число  "+i);
        }

    }
}
