package com.ramo.examples.test;

public class Cafeteria {
    private int tableCount;
    private int chairCount;
    private int stallsCount;
    private boolean isFoodAvailable = true;

    private static Cafeteria singletonInstance;

    private Cafeteria() {
        System.out.println("Getting some huge data from DB");
        System.out.println("Doing heavy lifting..");
    }

    public static Cafeteria getInstance() {
        System.out.println("getInstance() method called");
        if (singletonInstance == null)
            singletonInstance = new Cafeteria();
        return singletonInstance;
    }

    public int getTableCount() {
        return tableCount;
    }

    public void setTableCount(int tableCount) {
        this.tableCount = tableCount;
    }

    public int getChairCount() {
        return chairCount;
    }

    public void setChairCount(int chairCount) {
        this.chairCount = chairCount;
    }

    public int getStallsCount() {
        return stallsCount;
    }

    public void setStallsCount(int stallsCount) {
        this.stallsCount = stallsCount;
    }

    public boolean isFoodAvailable() {
        return isFoodAvailable;
    }

    public void setFoodAvailable(boolean foodAvailable) {
        isFoodAvailable = foodAvailable;
    }
}
