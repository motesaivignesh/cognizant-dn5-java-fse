class Sample1 extends Thread{
    public void run(){
        for(int i=1;i<10;i=i+2){
            System.out.print(i+" ");
        }
    }
}
class Sample2 extends Thread{
    public void run(){
        for(int i=2;i<10;i=i+2){
            System.out.print(i+" ");
        }
    }
}
public class Mythread {
    public static void main(String[] args){
        Sample1 s1 = new Sample1();
        Sample2 s2 = new Sample2();
        s1.start();
        s2.start();
    }
}
