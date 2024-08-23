// Creating an ARRAYs

import java.util.Arrays;

public class Arr{
    
    /**
     * @param args
     */
    public static void main(String args[]){

        // 1D Array
        int[] ar1= new int[4];
        ar1[0]=3;
            //System.out.println("1D Array: "+ar1[0]);

        // 2D Array
        int[][] ar2= new int[1][2];
        ar2[0][0]= 20;
            //System.out.println("2D Array; "+ar2[0][0]);

        //LENGTH OF AN ARRAY
        int[] arr={1,2,3,4,56};
        int len=arr.length;
            //System.out.println("\n Length of an array : "+len+"\n");
        
        for(int i=0;i<len;i++){
           // System.out.println("array value position "+i+"  is  "+arr[i]);
        }


        int[] src={1,2,3,4,5,};
        String srcf=Arrays.toString(src);
            System.out.println(srcf);
        int[] des=src;
        String srcff=Arrays.toString(des);
            System.out.println(srcff);

        // ENHANCED FOR LOOP 
        String[] ar7={"apple","cherry","banana"};
       // System.out.println("Elements of ar7 array are \n");
        for (String m:ar7){
           System.out.println(m+"\n");
        }


        }
    }






