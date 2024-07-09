package challenge2.modified;

import challenge2.modified.Eating.ChewMore;
import challenge2.modified.Running.HopAndRun;
import challenge2.modified.Swimming.NoSwim;

public class Dog extends Animal{

    public Dog(String id, String name){
        this.id = id;
        this.name = name;
        eatBehavior = new ChewMore();
        runBehavior = new HopAndRun();
        swimBehavior = new NoSwim();
    }


}
