public class Methodoverload {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args){
        Methodoverload m = new Methodoverload();
        System.out.println(m.add(10,20));
        System.out.println(m.add(10, 20,30));
        System.out.println(m.add(23.90,10.10 ));
    }
}
