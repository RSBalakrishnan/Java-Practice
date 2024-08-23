class Solve01{
    

    static int secondSmallest(int[] a){
        int min1=0;
        int min2=0;

        if (a[0]<a[1]){
            min1=a[0];
            min2=a[1];
        }
        else if (a[0]>a[1]){
            min1=a[1];
            min2=a[0];
        }

        for (int i=2;i<a.length;i++){
            if (a[i]<min1){
                min2=min1;
                min1=a[i];

            }
            else if (a[i]<min2){                
                min2=a[i];
            }
            
        }
        System.out.print("Second Smallest is ");
        return min2;
    }

    static int smallest(int[] a){
        int min1=0;
        int min2=0;

        if (a[0]<a[1]){
            min1=a[0];
            min2=a[1];
        }
        else if (a[0]>a[1]){
            min1=a[1];
            min2=a[0];
        }

        for (int i=2;i<a.length;i++){
            if (a[i]<min1){
                min2=min1;
                min1=a[i];

            }
            else if (a[i]<min2){                
                min2=a[i];
            }
            
        }
        System.out.print("Smallest is ");
        return min1;
    }

    
    public static void main(String[] args){
        int[] a ={6,7,2,8,9,4,5};

        System.out.println(secondSmallest(a));
        System.out.println(smallest(a));

    }
}