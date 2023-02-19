public class Multi_Arrays {
    public static void main(String[] a){
        //int[] numbers = {1,2,3};

        int[][] matrice = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        /**System.out.println(matrice[0][2]);
        /**
         * 156
         * 155[1][1]
         * 154
*/
        String[][] strings = new String[2][3];
        strings[0][1]= "привет";//иницилизация массива
        System.out.println(strings[0][1]);

       for (int i = 0; i < matrice.length; i++){
           for(int j = 0; j<matrice[i].length;j++){
               System.out.print(matrice[i][j] +" ");
           }
           System.out.println();
        }
    }

}
