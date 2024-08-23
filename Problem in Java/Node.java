// YOU WANT TO PRACTICE MORE ABOUT THIS TOPIC

import java.lang.reflect.Array;
import java.util.Scanner;

public class  Node{
    private int[] numArray;
    private int root;

    //Constructor 
    public Node(int[] numArray,int root){
        this.numArray=numArray;
        this.root=root;
    }
    //Declaration for Searching mehtod
    
    int start=0;
    int end=n;
    int midValue=(start+end) /2;
    
    // Searching Method 
    public int binarySearch(){

        int n=numArray.length;

        if ( root == numArray[midValue] ){
            return midValue;
        }
        if (root < numArray[midValue]){
            end =midValue;

            midValue=(start+end) /2;
            return binarySearch();
        }
        else if ( root > numArray[midValue]){
            start =midValue;
            midValue=(start+end) /2;
            return binarySearch();
            
        }
    return -1;
    }
}

class Main{
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("\n  GIVE THE SORTED ARRAY TO BE FIND THE ELEMENTS POSITION  ");
        String num=input.nextLine();

        String[] strToNum =num.split(" ");

    //    int[] nums=new int[strToNum.length];
        
    //    for ( int i=0; i<strToNum.length; i++){
    //        nums[i]=Integer.parseInt(strToNum);
    //    }
        int[] nums=java.util.Arrays.stream(strToNum).mapToInt(Integer::parseInt).toArray();

        System.out.println("\n  TARGET VALUE ");
        int target=input.nextInt();

        input.close();

        Node ran= new Node(nums,target);
        int  result=ran.binarySearch();
        System.out.println("\n  The Element "+target+" is in the Position of  "+(result+1)+"\n\n");
    
    
    
    }
}
