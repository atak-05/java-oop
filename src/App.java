public class App {
    public static void main(String[] args) throws Exception {
        cat cat = new cat();
        // cat.miyav();
        cat.name = "bidik";
        cat.color = "light-yellow";
        cat.age = 2;     
        
        System.out.println("he is name "+ cat.name +  ", have a color " + cat.color+ " and "+cat.age + " years old.."+ " He always say :" );
        cat.miyav();


        System.out.println("*******************************");

        dog dog = new dog();
        dog.name = "Atak";
        dog.color = "black";
        dog.age = 3;
        
        System.out.println("he is name "+ dog.name +  ", have a color " + dog.color+ " and "+dog.age + " years old.."+ " He always say :" );
        dog.havla();


    }
}
