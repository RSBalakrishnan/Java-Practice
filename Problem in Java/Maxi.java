public class Maxi {

    // Method for finding maximum in a array

    public static void findmax(int[] array){

            int maxx=0;
            for (int i=0;i<array.length;i++){
                
                if (array[i]>=maxx){
                    
                   maxx=array[i];
                }
                
            }
            System.out.println("final  value is "+maxx);

    }


    public static void main(String args[]){

        int[] arr={2,1000,4,13,54,67,98,65};
        findmax(arr);


    }
}