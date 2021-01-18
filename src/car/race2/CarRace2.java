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
public class CarRace2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car[] race = {
        new Car("First", 140),
        new Car ("Second", 180),
        new Car ("Third", 120),
        new Car ("Fourth", 160),
        new SportsCar("FirstSportsCar", 260),
        new SportsCar("SecondSportsCar", 230),
        new SportsCar("ThirdSportsCar", 290),
        new SportsCar("FourthSportsCar", 270),
        };
        int interm = 100;
        boolean doRace = true;
        
        while (doRace) {
            // kiekviena masina pavaziuoja po random nuo 0 iki 10 km
            for (int i = 0; i < race.length; i++) {
                if (race[i] instanceof SportsCar) {
                    if (Math.random() < 0.5) {
//                        SportsCar sc = (SportsCar) race[i];
//                        sc.changeSpoiler();
                        ((SportsCar) race[i]).changeSpoiler();
                    }
                }
                double chance = Math.random();
                if (chance < 0.3) {
                    race[i].brake((int) (Math.random() * 5 + 1));     
                } else if (chance < 0.8) {
                    race[i].speed((int) (Math.random() * 10 + 1));   
                }
                race[i].go();
            }
            boolean printInterm = false;
            int intermWinner = 0;
            int intermWinnerKm = 0;
            for (int i = 0; i < race.length; i++) {
                if (race[i].getDistance() > intermWinnerKm) {
                    intermWinner = i;
                    intermWinnerKm = race[i].getDistance();
                }
                if (race[i].getDistance() >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if (printInterm) {
                for (int i = 0; i < race.length; i++) {
                    System.out.print(race[i].getDistance() + "\t");
                }
                System.out.println();
                System.out.println("At the moment first is: " + race[intermWinner]);
            }
            for (int i = 0; i < race.length; i++) {
                if (race[i].getDistance() >= 1000) {
                    doRace = false;
                    break;
                }
            }
        }
        for (int i = 0; i < race.length - 1; i++) {
            for (int j = i + 1; j < race.length; j++) {
                if (race[i].getDistance() < race[i].getDistance()) {
                    Car tmp = race[i];
                    race[i] = race[j];
                    race[j] = tmp;
                }
            }
        }
        for (int i = 0; i < race.length; i++) {
            System.out.println(race[i]);
        }
        
       
//sukurti klase masina
// parametrai
// pavadinimas, nuvaziuotas kelias. maksimalus greitis
// pavadinimas yra stringas

//Masina[] race {
//new Masina("Pirma", 140);
//new Masina("Antra", 160);
//new Masina("Pirma", 140);
//new Masina("Antra", 160);
//new SportineMasina("SP1", 230)
//};
// Jei sportine masina tada
// 50% tikimybe, kad pasikeis spoilerio pozicija
// Metode gazuok,, jei spoileris nuleistas - gazuoja du kartus greiciau
// Metode stabdyk, jei spoileris pakeltas, stabdo du kartus greiciau




// 30% tikimybe stabdys 1-5
// 50% tikimybe gazuos 1-10
// 20% tikimybe nekeis greicio

// jei pasieke 1000 km lenktynes baigesi

// sukurti dar viena klase sportine masina
// ji turi spoileri, kuris pakeltas arba nuleistas true, false
    }
    
}
