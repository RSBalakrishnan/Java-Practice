import java.util.ArrayList;
import java.util.List;

class NewSol02{
    public static void main(String[] args){

        List<Object> lis = new ArrayList<>();

        lis.add(312);
        lis.add("Hello");
        lis.add('A');
        lis.add(67);

        lis.add(2,"mad");
        
        int len=lis.size();

        lis.set(2,345);
        System.out.println(lis);

        System.out.println(len);

    }
 }