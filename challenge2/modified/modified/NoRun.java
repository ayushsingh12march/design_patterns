package challenge2.modified.Running;

public class NoRun implements RunBehavior{

    @Override
    public void run(){
        System.out.println("Running is not possible");
    }

    @Override
    public boolean canRun(){
        return false;
    }
}
