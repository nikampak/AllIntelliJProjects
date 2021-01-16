package Repl;

public class it_227_OOP8_ParkingMeeter {

    int timeLeft = 0, maxTime;

    public it_227_OOP8_ParkingMeeter(int maxTime){
        this.maxTime=maxTime;
    }
    public boolean add(int value){
        if (timeLeft < maxTime && value >= 25 ){
            this.timeLeft += 30;
            return true;
        }else {
            this.timeLeft=timeLeft;
            return false;
        }
    }
    public void tick(){
        if (timeLeft > 0 ){
            timeLeft--;
        }
    }
    public boolean isExpired () {
        if (timeLeft == 0){
            return true;
        }else{
            return false;
        }
    }
}
