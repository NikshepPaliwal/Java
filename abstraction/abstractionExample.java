package abstraction;

public class abstractionExample {
    public static void main(String[] args){
        circle cir = new circle();
        Rectangle reg = new Rectangle();
        cir.draw();
        reg.draw();
        cir.description();
        reg.description();
    }
}
