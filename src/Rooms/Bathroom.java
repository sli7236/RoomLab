package Rooms;

import Game.Runner;
import People.Person;

public class Bathroom extends Room {

    public Bathroom(int x, int y) {
        super(x, y);
    }

    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the bathroom.");
    }
}
