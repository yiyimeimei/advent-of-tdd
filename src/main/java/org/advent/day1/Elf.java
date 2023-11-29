package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private int totalCalories = 0;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    @Override
    public int compareTo(Elf arg0) {
        int elf0Calory = arg0.getTotalCalories();
        return this.totalCalories - elf0Calory;
    }

    public void addCalories(int calory) {
        this.totalCalories += calory;
    }

}
