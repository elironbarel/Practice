package simple.test;

import java.lang.reflect.Array;

public class twoMaxValues {

    public static int maxValue(int[] array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i] >= array[i++]){
                max = array[i];
            }
            else{
                max = array[i++];
            }
        }
        return max;
    }
    public static int secMaxValue(int[] array){

        int firstmax = maxValue(array);
        int max=0;

        for(int i=0;i<array.length;i++){
            if(array[i] >= array[i++] && max != firstmax){
                max = array[i];
            }
            else{
                continue;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int myArray[]= {1,2,3,4,5,6,5,8,3};
        System.out.println("First max Value is: "+maxValue(myArray));
        System.out.println("Sec max Value is: "+secMaxValue(myArray));
    }

}
