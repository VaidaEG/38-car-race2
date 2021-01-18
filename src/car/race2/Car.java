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
public class Car {
    private String name;
    private int maxSpeed;
    private int distance;
    private int speed;
    
    public Car (String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.distance = distance;
        this.speed = speed;
    }
    public void speed(int howMuch) {
        if (howMuch <= 0) {
            return;
        }
        this.speed += howMuch;
    }
    public void brake(int howMuch) {
        if (howMuch <= 0) {
            return;
        }
        this.speed -= howMuch;
        if (this.speed < 0) {
            this.speed = 0;
        }
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }
    public void go() {
        this.distance += Math.random() * 10 + 1;    
    }
    public String toString() {
        return "Car{" + "name=" + name + ", max speed=" + maxSpeed + ", distance=" + distance + '}';
    }
}
