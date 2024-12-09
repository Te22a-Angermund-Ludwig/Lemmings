public class Exploder extends Lemming{
    public int timer = 10;
    public boolean isActivated = false;

    public void activate(){
        if (!isActivated){
            isActivated=true;
        }
    }

    public void update(){
        if (isActivated){
            timer=timer-1;
            if (timer<=0){
                System.out.println("Kaboom!");
                isActivated=false;
            }
        }
    }

    public Exploder(){

    }
}
