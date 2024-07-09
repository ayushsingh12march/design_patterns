package challenge2.modified.Eating;

import challenge2.modified.Eating.EatBehavior;

public class ChewMore implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("Chew more");
    }
}
