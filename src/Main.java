public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog(500, 10);
        dog.setName("Pluto");
        dog.setObstacleLengthRun(200);
        dog.setObstacleLengthSwim(10);
        Dog.count();
        Main.count();

        Cat cat = new Cat(200, 0);
        cat.setName("Garfield");
        cat.setObstacleLengthRun(150);
        cat.setObstacleLengthSwim(0);
        Cat.count();
        Main.count();

        dog.resultRun(dog.getObstacleLengthRun(), dog.getMaxLengthRun());
        dog.resultSwim(dog.getObstacleLengthSwim(), dog.getMaxLengthSwim());
        cat.resultRun(cat.getObstacleLengthRun(), cat.getMaxLengthRun());
        cat.resultSwim(cat.getObstacleLengthSwim(), cat.getMaxLengthSwim());

        System.out.println("Cats count is " + Cat.count);
        System.out.println("Dogs count is " + Dog.count);
        System.out.println("Animals total count is " + Main.count);
    }

    // счетчик общего количества животных
    public static int count;

    public static void count() {
        count++;
    }
}
