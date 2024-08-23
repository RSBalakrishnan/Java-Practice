class Snum2{

    static void singleNum(int[] ar){
        int n=0;
        int k=1;
        int temp=0;
        while (k<ar.length-1){
            if (ar[n]!= ar[k]){
                k++;
                
            }else{
                temp=k;
                k++;
                n++;
            }
        }
        System.out.println(ar[temp]);


    }

    public static void main(String args[]){

        int[] ar={2,2,3,2};           // >> 3
        int[] ar1={0,1,0,99,1,0,1};   // >> 99

        singleNum(ar);
        singleNum(ar1);




    }


}