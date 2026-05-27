public class Typecaste {
    public static void main(String[] args) {
        double originalDouble = 45.78;
        int castedInt = (int) originalDouble;
        System.out.println("Original double value: " + originalDouble);
        System.out.println("Casted int value" + castedInt);
        System.out.println();
        int originalInt = 15;
        double castedDouble = originalInt;
        System.out.println("Original int value: " + originalInt);
        System.out.println("Casted double value (widening): " + castedDouble);
    }
}
