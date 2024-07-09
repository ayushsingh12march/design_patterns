package challenge2.modified.Eating;

import challenge2.modified.Eating.EatBehavior;

public class Swallow implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("Swallow");
    }
}
