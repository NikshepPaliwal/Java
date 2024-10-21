package Polymorphism;
public class polymorphismExample {
    public static void main(String[] args){
        calculator objCalculator = new calculator();
        System.out.println(objCalculator.add(10,11));

        System.out.println(objCalculator.add(10.52, 10.0));

    }
}
