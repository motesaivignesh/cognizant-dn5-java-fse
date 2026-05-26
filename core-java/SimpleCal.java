import java.lang.classfile.instruction.SwitchCase;
import java.util.*;
public class SimpleCal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char opr = sc.next().charAt(0);
        switch(opr){
            case '+':{
                System.out.println("sum is "+(a+b));
                break;
            }
            case '-':{
                System.out.println("sub is "+(a-b));
                break;
            }
            case '*':{
                System.out.println("mul : "+a*b);
                break;
            }
            case '/':{
                System.out.println("Div :"+a/b);
                break;
            }
            default:
                System.out.println("Invalid opr");
        }
    }
}
