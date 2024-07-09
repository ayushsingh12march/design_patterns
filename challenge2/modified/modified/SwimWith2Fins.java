package challenge2.modified.Swimming;

public class SwimWith2Fins implements SwimBehavior{

    @Override
    public void swim(){
        System.out.println("Swimming with 2 fins");
    }
    @Override
    public boolean canSwim(){
        return true;
    }
}
