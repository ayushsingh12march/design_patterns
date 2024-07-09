package challenge2.modified.Running;

public class HopAndRun implements RunBehavior{
    @Override
    public void run() {
        System.out.println("Hop and run");
    }

    @Override
    public boolean canRun(){
        return true;
    }
}
