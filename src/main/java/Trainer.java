public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting, hey d now you are a bird
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting, hey b now you are a animal
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting, hey a now you are a duck
        getToSpeak(d2);
        train(new Duck());
        train(new Parrot());
      //  Animal a2 = new Animal();
        // Bird b2 = new Bird();
    }

    private static void getToSpeak(Animal animal) {

        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if(bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
