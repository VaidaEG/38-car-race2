/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.race2;

/**
 *
 * @author 37067
 */
public class SportsCar extends Car {
    private boolean spoiler;
    
    public SportsCar(String name, int maxSpeed){
        super(name, maxSpeed);
        this.spoiler = false;
    }  
    public void changeSpoiler() {
        this.spoiler = !this.spoiler;
    }
    public void speed(int howMuch) {
        if (!this.spoiler) {
            super.speed(howMuch * 2);
        } else {
            super.speed(howMuch);
        }
    }
    public void brake(int howMuch) {
        if (this.spoiler) {
            super.brake(howMuch * 2);
        } else {
            super.brake(howMuch);
        }
    }
    public String toString() {
        return "Sports " + super.toString();
    }
}
