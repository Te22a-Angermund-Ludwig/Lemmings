public class Lemming {
    public int x;
    public int y;
    public int direction;

    public void walk(){
        if (x>=20){
            x = x-1;
            direction=1;
        } else if (x<=-20) {
            x= x+1;
            direction=2;
        }
        if (direction==2) {
            x=x+1;
        } else if (direction==1) {
            x=x-1;
        }
    }

    public Lemming(){
        x=0;
        y=0;
        direction=2;
    }
}
