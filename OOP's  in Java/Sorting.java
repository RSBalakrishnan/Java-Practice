public class Sorting{

    // arr= 3 1 4 1 5 9

    public static void sortt(int[] array){
            for (int i=0; i<array.length-1; i++){

                if (array[i]>array[i+1]){
                    int m=array[i+1];
                    array[i+1]=array[i];
                    array[i]=m;
                }
                
                
                }
                System.out.println("Sorted array is  ; ");
                for(int i=0;i<array.length-1;i++){
                    System.out.println(array[i]);
                
                }


    }

    public static void main(String args[]){
        int[] arr={9,7,87,65,3,1,4};
        sortt(arr);

    }

    
}