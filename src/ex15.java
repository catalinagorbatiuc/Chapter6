//Hypotenuse Calculations
public class ex15 {
    static double getHypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
    public static void main(String[] args) {
        System.out.printf("Triangle 1: %.2f%n", getHypotenuse(4, 8));
        System.out.printf("Triangle 2: %.2f%n", getHypotenuse(5, 19));
        System.out.printf("Triangle 3: %.2f%n", getHypotenuse(3, 15));
    }
}
