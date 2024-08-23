public class Solve02{

    static int SecondLargest(int[] a){
        int max1,max2;

        if (a[0]>a[1]){
            max1=a[0];
            max2=a[1];
        }
        else {
            max1=a[1];
            max2=a[0];
        }

        for(int i=2;i<a.length;i++){
            if (a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if (a[i]>max2){
                max2=a[i];
            }
        }
        System.out.print("Second Largest is ");
        return max2;

    }


    public static void main(String[] args){
        int[] a={43,4,24,8,234,98,12,9,34};

        System.out.println(SecondLargest(a));
    }
    
}