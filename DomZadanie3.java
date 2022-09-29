/**
* Java Basic. Home work #3
*
*@author Veronika
*@todo 07.09-2022
*@date 14-21.09-2022
*/

class DomZadanie3 {
    public static void main(String[] args) {    
    // home1
    int[] array = {10, 11, 88, 2, 12, 120};
    printArray(array); // zdes  printArray kak u vas v video. Gde je oshibka?
    
    
    // home2
    double variable = getMaxValue(5.3, 39.6, -4);
    int max = getMax(array);
    System.out.println("Max element: " + max);
    }
    
      // home3
    int[] invertArray(int[] array){
        int[] result=new int[array.length];
        for (int index = 0; index<array.length; index++){
            if (array[index] == 0) {
                result[index] = 1;
            } else if (array[index] == 1) {
                result[index] = 0;
            }
        }
        return result;
      }
}       


 