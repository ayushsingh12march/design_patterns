package challenge2.modified.Swimming;

public class NoSwim implements SwimBehavior{

    @Override
    public void swim(){
        System.out.println("Swimming is not possible");
    }

    @Override
    public boolean canSwim(){
        return false;
    }
}
