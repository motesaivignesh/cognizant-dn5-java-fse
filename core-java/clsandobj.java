class Car{
    String name;
    String model;
    int year;
    public Car(String name,String model,int year){
        this.name=name;
        this.model=model;
        this.year=year;
    }
    public void display(){
        System.out.println("name of the car: "+name);
        System.out.println("model :  "+model);
        System.out.println("year "+year);

    }
}
public class clsandobj {
    public static void main(){
        Car c = new Car(null, null, 0);
        c.display();
    }
}
