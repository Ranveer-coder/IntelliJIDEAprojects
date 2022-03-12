import java.io.*;
interface Vehicle {
    //all are abstract methods
    void changeGear(int a);
    void speedUp(int b);
    void applyBrakes(int c);

}

class Bicycle implements Vehicle{

    int gear;
    int speed;

    //to change gear

    @Override
    public void changeGear(int newGear){
        this.gear = newGear;
    }

    //to increase speed

    @Override
    public void speedUp(int increment){
        this.speed = increment + speed;
    }

    //to apply brakes
    @Override
    public void applyBrakes(int decrement){
        this.speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed: " + speed + " gear: " +gear);
    }

    public static void main(String[] args) {
        Bicycle B = new Bicycle();
        B.changeGear(2);
        B.speedUp(3);
        B.applyBrakes(1);
        System.out.println("Bicycle present state : ");
       //will print info of bike which we listed above
        B.printStates();
    }
}
