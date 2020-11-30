package com.vtb.java.challenge.competitor.obstacles;

import com.vtb.java.challenge.competitor.interfaces.Obstacle;
import com.vtb.java.challenge.competitor.interfaces.Performable;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcomeBarrier(Performable performables) {
        performables.jump(height);
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                '}';
    }

}
