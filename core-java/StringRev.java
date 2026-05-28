import java.util.*;
public class StringRev {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("reverse of the string "+str+" is "+sb.reverse().toString());
    }
}
