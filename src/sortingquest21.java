import java.util.ArrayList;
import java.util.Random;

class cow{
    int id;
    double x,y;
    boolean aggressive;

    public cow (int id, double x , double y){
        this.id = id;
        this.x = x;
        this.y = y;
        this.aggressive = false;
    }

    public void setAggresive(){
        aggressive= true;
    }
    public void move(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceTo(cow othercow){
        return Math.sqrt(Math.pow(this.x- othercow.x,2)+ Math.pow(this.y- othercow.y,2));
    }
}
class Field{
    ArrayList<cow> cows = new ArrayList<>();
    double feildWidth, fieldHeight;

    public Field(int numcows, double feildWidth, double fieldHeight){
        this.feildWidth = feildWidth;
        this.fieldHeight = fieldHeight;
        generatecows(numcows);
    }
    public void generatecows(int numcows){
        Random random = new Random();
        for (int i = 0; i< numcows; i++){
        double x= random.nextDouble()* feildWidth;
        double y = random.nextDouble()*fieldHeight;
        cow cow = new cow(i,x,y);
        cows.add(cow);
        }
    }



}




