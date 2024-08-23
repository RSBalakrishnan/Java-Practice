class Sol1907{

    static void reverse(int[] ar){
        int i=0,j=ar.length-1;
        while(i<=j){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[] ar){
        int j=ar.length-1;
        int temp=0;
        while (j>=0) {
            
        
            if  (j == ar.length-1){
                temp=ar[j];
                ar[j]=ar[j-1];
            }else if(j>=1 && j<ar.length-1){
                ar[j] = ar[j-1]; 
            }else if(j == 0){
                ar[0]=temp;
            }
            j--;
        }
    }

    static void rotateOf(int[] ar, int k){
        int temp=ar[0];
        for(int i=1; i<ar.length; i++){
            ar[i-1]=ar[i];
        }
        ar[ar.length-1]=temp;
    }


    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,9};

        rotateOf(arr,1);
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}