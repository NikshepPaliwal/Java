public class person {
    String name;
    int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
        else{
            System.out.println("Age cannot be Zero or Negative");
        }
    }
}
