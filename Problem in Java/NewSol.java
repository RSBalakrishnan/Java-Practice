public class NewSol{

    public static void numer(int start,int end){
        
        for (int i=0;i<10000;i++){
            System.out.print(start+" ");
            end--;
            start++;
        }

    }

    public static void main(String args[]){

        int s=1;
        int e=10000;

        numer(s,e);

    }
}