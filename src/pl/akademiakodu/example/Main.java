package pl.akademiakodu.example;

public class Main {

    public static void main(String[] args) {

//        int[] tab = new int[5];
//
//        tab[0]=5;
//        tab[1]=2;
//        tab[4]=10;
//
//        System.out.println("Wartość: " + tab[2]);
//  --------------------------------------------------------
//        int[] tab = new int[]{5, 1, 2, 6, 7};
//
//        tab[2] = 10;
//
//        System.out.println("Wartość: " + tab[3]);
//  --------------------------------------------------------
//        int[] tab = new int[]{5, 1, 2, 6, 7};
//
//        tab[2] = 10;
//
//        System.out.println("Wartość: " + tab[6]);
//       Bład bo 6 elementu nie ma
//  --------------------------------------------------------
        int[][]doubleTab = new int[3] [5];

        doubleTab[0][0] = 5;
        //.
        //.
        doubleTab[0][4] = 10;
        doubleTab[1][0] = 123;

        System.out.println(doubleTab[0][1]);

    }
}
