package challenge2.modified.Running;

public class WalkBriskly implements RunBehavior{

    @Override
    public void run(){
        System.out.println("walk briskly");
    }

    @Override
    public boolean canRun(){
        return true;
    }
}
