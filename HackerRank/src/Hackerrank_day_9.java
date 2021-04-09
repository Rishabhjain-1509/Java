//Complete this code or write your own from scratch
import java.util.*;

class Hackerrank_day_9{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Hashtable<String, Integer> geek = new Hashtable<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            geek.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (  geek.containsKey(s) )
            {
            	System.out.println(s+"="+geek.get(s));

            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

