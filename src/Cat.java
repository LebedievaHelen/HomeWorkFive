public class Cat extends Animal {

    public Cat(int maxLengthRun, int maxLengthSwim) {
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

    // счетчик котов
    public static int count;

    public static void count() {
        count++;
    }
}
