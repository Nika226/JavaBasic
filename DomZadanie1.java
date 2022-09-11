/**
* Java Basic. Home work #1
*
*@author Veronika
*@11.09-2022
*
*/

class DomZadanie1 {
    public static void main(String[] args) {
        // home1
        int a = 10;
        int b = 15;
        int p = 2 * (a + b);
        int s = a * b;
        System.out.println("getperimeter = " + p);
        System.out.println("Area = " + s);
        
        // home2
        a = 3;
        b = 5;
        int c = a+b;
        System.out.println(c);
        c = a-b;
        System.out.println(c);
        c = a*b;
        System.out.println(c);
        c = a/b;
        System.out.println(c);
        
        // home3
        int[] myArray = {118, 96, 87, 44, 63};
        //System.out.println(myArray[0], myArray[1], myArray[2], myArray[3], myArray[4]); - does not work, I do not understand why?
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);        
        
    }
}
