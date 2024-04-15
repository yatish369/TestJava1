
public class Main{
    public static void main(String[] args)
    {
        System.out.println("Hello World!!!");
        System.out.print("This is a line");
        System.out.println("This is a second line");
        System.out.println("This is a new line");
        Dog dog1 = new Dog("ABCDD", "5", "DOGGY");
        callMyDog(dog1);
        Dog dog2 = new Dog();
        dog2.setName("DDCBA");
        dog2.setLegs("4");
        dog2.setType("KATTY");
        callMyDog(dog2);
    }

    public static void callMyDog(Dog dog){
        if(dog.getLegs().equals("4")) {
            System.out.println(dog.getName());
            System.out.println(dog.getLegs());
            System.out.println(dog.getType());
        }
    }


}