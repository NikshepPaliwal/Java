package Classes_and_Object;
public class classObjectExample {
    public static void main(String[] args){
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2021);
        System.out.println("Car-1 information : ");
        car1.diaplayInfo();
        System.out.println("Car-2 information : ");
        car2.diaplayInfo();
    }
}
