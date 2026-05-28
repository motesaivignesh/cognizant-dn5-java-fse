import java.util.*;
public class Strpalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb  =new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String org = sb.toString();
        // Remove non-alphanumeric characters using a regular expression
        // String org = original.replaceAll("[^a-zA-Z0-9]", "");
        
        // Convert the remaining text to lowercase
        // org = org.toLowerCase();
        int i=0,j=org.length()-1;
        while(i<j){
            if(org.charAt(i)!=org.charAt(j)){
                System.out.println("not a palindrome");
                break;
            }
            i++;
            j--;
        }
        if(i>=j){
            System.out.println("palindrome");
        }
    }
}
