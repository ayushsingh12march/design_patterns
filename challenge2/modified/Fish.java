package challenge2.modified;


import challenge2.modified.Eating.Swallow;
import challenge2.modified.Running.NoRun;
import challenge2.modified.Swimming.SwimWith2Fins;

public class Fish extends Animal{
    public Fish(String id, String name){
        this.id = id;
        this.name = name;
        eatBehavior = new Swallow();
        runBehavior = new NoRun();
        swimBehavior = new SwimWith2Fins();
    }
}
