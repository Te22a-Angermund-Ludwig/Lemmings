public class Jumper extends Lemming{
    public int jumpForce;

    public void jump(){
        if (jumpForce==0){
            jumpForce = 20;
        }
    }

    public void update(){
        if (jumpForce>=0){
            y=y+1;
            jumpForce=jumpForce-1;
        }
        if (jumpForce<=0){
            if (y>0){
                y=y-1;
            }
        }
    }

    public Jumper(){

    }
}
