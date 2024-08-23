// LeetCode Problem 231 .


class SolutionOf {
    public static boolean isPowerOfTwo(int n) {
        int m =3;
        if (n==1){
            return true;
        }
        while (m <=n){
            if (n%2==0){
                if (n<64){
                    n=n/2;
                }
                else if (n>=64 && n<=512){
                    n=n/32;
                }
                else if  (n>512){
                    n=n/1024;
                }
            }
            else{
                n=1;
            }
        }
        if (n==2){
            return true;
        }else{
            return false;
        }      
    }   
    public static void main(String[] args) {
       // SolutionOf s = new SolutionOf();
        System.out.println(isPowerOfTwo(66));
    }
}