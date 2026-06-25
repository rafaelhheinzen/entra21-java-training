public class Main{

public static void main(String[] args) {
    //Setting the first cow;
    Cow cow1 = new Cow("Belly", "Holstein", 500.0, 5);

    //Executing showStats method;
    cow1.showStats();

}

}


class Cow{
    String name;
    String race;
    double weight;
    int age;


    void showStats(){
        System.out.println("Cow analyzer");
        System.out.println("Name: "+this.name);
        System.out.println("Race: "+this.race);
        System.out.println("Weight: "+this.weight);
        System.out.println("Age: "+this.age);
    }

    Cow(String name, String race, double weight, int age){
        this.name = name;
        this.race = race;
        this.weight = weight;
        this.age = age;
    }
}