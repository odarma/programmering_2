package noe.zooregister.models;

import java.time.LocalDate;

public class HoneyBadger extends Animal{
    private int numSnakesEaten = 0;

    public HoneyBadger(String name, LocalDate birthDate) {
        super(name,birthDate);

    }

    public int getNumSnakesEaten() {return numSnakesEaten;}
    public void setNumSnakesEaten(int numSnakesEaten) {this.numSnakesEaten = numSnakesEaten;}
    public void eatASnake(int numSnakesEaten){numSnakesEaten++;}
}
