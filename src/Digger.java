public class Digger extends Lemming{
    public Boolean isDigging = false;

    public void startDigging(){
        if (!isDigging){
            isDigging=true;
        }
    }

    public void update(){
        if (isDigging){
            y=y-1;
            isDigging=false;
        }
    }

    public Digger(){

    }

}
