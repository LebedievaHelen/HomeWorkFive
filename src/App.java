public class App {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Pluto");
        dog.setObstacleLengthRun(200);
        dog.setMaxLengthRun(500);
        dog.setObstacleLengthSwim(10);
        dog.setMaxLengthSwim(10);

        dog.resultRun(dog.getObstacleLengthRun(), dog.getMaxLengthRun());
        dog.resultSwim(dog.getObstacleLengthSwim(), dog.getMaxLengthSwim());

        Cat cat = new Cat();
        cat.setName("Garfield");
        cat.setObstacleLengthRun(150);
        cat.setMaxLengthRun(200);
        cat.setObstacleLengthSwim(0);
        cat.setMaxLengthSwim(0);

        cat.resultRun(cat.getObstacleLengthRun(), cat.getMaxLengthRun());
        cat.resultSwim(cat.getObstacleLengthSwim(), cat.getMaxLengthSwim());
    }
}
