public class palindromeCheck{

    public static boolean palindrome(String var){
        
        int left = 0;
        int right = var.length() -1;
        
        while(left<right){
            if (var.charAt(left) != var.charAt(right)){
                return false;
            }
            left ++ ;
            right -- ;
        }
        return true;
    }

    public static void main(String args[]){
        String word0 = "madam";
        String word1 = "malayalam";
        String word2 = " madam";        // Having space at 0th position.
        System.out.println(palindrome(word0));
        System.out.println(palindrome(word1));
        System.out.println(palindrome(word2));

    }

}