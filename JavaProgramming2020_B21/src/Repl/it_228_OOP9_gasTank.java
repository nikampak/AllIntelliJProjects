package Repl;

public class it_228_OOP9_gasTank {

    double amount = 0, capacity;

    public it_228_OOP9_gasTank(double capacity){
        this.capacity = capacity;
    }
    public void addGas(double value1){
        if (value1 + amount > capacity){
            amount=capacity;
        }else{
            amount+=value1;
        }

    }
    public void useGas(double value2){
        if (amount - value2 < 0){
            amount=0;
        }else{
            amount-=value2;
        }

    }
    public boolean isEmpty(){
        if (amount < 0.1 ){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (amount > capacity - 0.1){
            return true;
        }else {
            return false;
        }
    }
    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        return capacity - amount ;
    }
}
