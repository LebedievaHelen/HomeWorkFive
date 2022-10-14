public class Dog extends Animal {

    public Dog(int maxLengthRun, int maxLengthSwim) {
        super(maxLengthRun, maxLengthSwim);
    }

    @Override
    public void resultRun(int obstacleLengthRun, int maxLengthRun) {
        super.resultRun(obstacleLengthRun, maxLengthRun);
    }

    @Override
    public void resultSwim(int obstacleLengthSwim, int maxLengthSwim) {
        super.resultSwim(obstacleLengthSwim, maxLengthSwim);
    }

    // счетчик собак
    public static int count;

    public static void count() {
        count++;
    }
}
