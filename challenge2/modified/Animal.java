package challenge2.modified;

import challenge2.modified.Eating.EatBehavior;
import challenge2.modified.Running.RunBehavior;
import challenge2.modified.Swimming.SwimBehavior;

public abstract class Animal {
     String id;
     String name;
     EatBehavior eatBehavior;
     RunBehavior runBehavior;
     SwimBehavior swimBehavior;

    public Animal(){}

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void eat() {
        eatBehavior.eat();
    }

    public void run() {
        runBehavior.run();
    }

    public boolean canRun(){
        return runBehavior.canRun();
    }

    public void swim() {
        swimBehavior.swim();
    }


    public boolean canSwim() {
        return swimBehavior.canSwim();
    }
}
