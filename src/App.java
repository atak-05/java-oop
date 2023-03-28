public class App {
    public static void main(String[] args) throws Exception {
        cat cat = new cat();
        // cat.miyav();
        cat.name = "bidik";
        cat.color = "light-yellow";
        cat.setAge(2);
        
        System.out.println("he is name "+ cat.name +  ", have a color " + cat.color+ " and "+cat.getAge() + " years old.."+ " He always say :" );
        cat.miyav();


        System.out.println("*******************************");

        dog dog = new dog();
        dog.name = "Atak";
        dog.color = "black";
        dog.setAge(3);
        
        System.out.println("he is name "+ dog.name +  ", have a color " + dog.color+ " and "+dog.getAge() + " years old.."+ " He always say :" );
        dog.havla();

        System.out.println("*******************************");

        animal animal = new animal("cenk", "blue",2);
        fish fish = new fish();

        System.out.println("he is name "+ animal.name +  ", have a color " + animal.color+ " and "+animal.getAge() + " years old.."+ " He always say :" );
        fish.swim();
    }
}
