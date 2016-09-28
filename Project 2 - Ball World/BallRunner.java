
public class BallRunner
{
    public BallRunner(){
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint tgPoint = new TGPoint (0,0);
        
    }

    public static void main (String [] args)
    {
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint tgPoint = new TGPoint (0,0);
        BallBot ballBot = new BallBot(ballWorld, tgPoint, 90.0, 50);
        while(true){
            if (ballBot.canMoveForward (ballWorld)){
                ballBot.moveForward();
            }
            else{
                ballBot.setHeading(Math.random() *360); 
            }
        }
    }

}