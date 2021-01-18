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
        Car c1 = new Car("First", 140);
        Car c2 = new Car ("Second", 180);
        Car c3 = new Car ("Third", 120);
        Car c4 = new Car ("Fourth", 160);
        Car sc1 = new SportsCar("FirstSportsCar", 260);
        Car sc2 = new SportsCar("SecondSportsCar", 230);
        Car sc3 = new SportsCar("ThirdSportsCar", 290);
        Car sc4 = new SportsCar("FourthSportsCar", 270);
        Car[] race = {c1, c2, c3, c4, sc1, sc2, sc3, sc4};
        int interm = 100;
        boolean doRace = true;
        
        while (doRace) {
            // kiekviena masina pavaziuoja po random nuo 0 iki 10 km
            for (int i = 0; i < race.length; i++) {
                race[i].go();
            }
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
