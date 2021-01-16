package Repl;

public class it_220_OOP3_getterSetter {
    private String data;
    private int yint;

    public void insertData(String data,int yint){
        this.data=data;
        this.yint=yint;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public int getYint(){
        return yint;
    }
    public void setYint(int yint){
        this.yint = yint;
    }
}
