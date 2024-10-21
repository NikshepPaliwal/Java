public class encapsulationExample {
    public static void main(String[] args){
        person newPerson = new person();
        newPerson.setName("Rahul Bhaskar");
        System.out.println(newPerson.getName());


        newPerson.setAge(24);
        System.out.println(newPerson.getAge());
    }
}
