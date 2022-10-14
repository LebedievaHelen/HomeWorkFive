public class Animal {

    private String name;
    private int obstacleLengthRun;
    private int obstacleLengthSwim;
    private int maxLengthRun;
    private int maxLengthSwim;

    public void setName(String name) {
        this.name = name;
    }

    public int getObstacleLengthRun() {
        return obstacleLengthRun;
    }

    public void setObstacleLengthRun(int obstacleLengthRun) {
        this.obstacleLengthRun = obstacleLengthRun;
    }

    public int getObstacleLengthSwim() {
        return obstacleLengthSwim;
    }

    public void setObstacleLengthSwim(int obstacleLengthSwim) {
        this.obstacleLengthSwim = obstacleLengthSwim;
    }

    public int getMaxLengthRun() {
        return maxLengthRun;
    }

    public void setMaxLengthRun(int maxLengthRun) {
        this.maxLengthRun = maxLengthRun;
    }

    public int getMaxLengthSwim() {
        return maxLengthSwim;
    }

    public void setMaxLengthSwim(int maxLengthSwim) {
        this.maxLengthSwim = maxLengthSwim;
    }

    public void run(int obstacleLengthRun) {
        System.out.println(name + " has run " + obstacleLengthRun + " meters");
    }

    public void swim(int obstacleLengthSwim) {
        System.out.println(name + " has swam " + obstacleLengthSwim + " meters");
    }

    public void resultRun(int obstacleLengthRun, int maxLengthRun) {

        if (obstacleLengthRun <= maxLengthRun) {
            run(obstacleLengthRun);
        } else {
            System.out.println("ObstacleLengthRun exceeding the permissible value");
        }
    }

    public void resultSwim(int obstacleLengthSwim, int maxLengthSwim) {

        if (obstacleLengthSwim <= maxLengthSwim) {
            swim(obstacleLengthSwim);
        } else {
            System.out.println("ObstacleLengthSwim exceeding the permissible value");
        }
    }
}
