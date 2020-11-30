package com.vtb.java.challenge;

import com.vtb.java.challenge.competitor.*;
import com.vtb.java.challenge.competitor.interfaces.Obstacle;
import com.vtb.java.challenge.competitor.interfaces.Performable;
import com.vtb.java.challenge.competitor.obstacles.RunningTrack;
import com.vtb.java.challenge.competitor.obstacles.Wall;

public class DemoSecondTestRun {
    public static void main(String[] args) {
        Performable human = new Human("Champion", 100, 8);
        Performable robot = new Robot("AI", 50, 2);
        Performable cat = new Cat("Kitty", 23, 5);

        Obstacle[] obstacles = {
                new RunningTrack(10),
                new Wall(1),
                new RunningTrack(20),
                new Wall(2),
                new RunningTrack(30),
                new Wall(3),
                new RunningTrack(50),
                new Wall(4),
                new RunningTrack(70),
                new Wall(5),
                new RunningTrack(90),
                new Wall(6),
                new RunningTrack(100),
                new Wall(7),
        };

        overcome(obstacles, human, robot, cat);
    }

    public static void overcome(Obstacle[] obstacles,
                                Performable... competitors) {
        for (Performable competitor : competitors) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcomeBarrier(competitor);
            }
        }
    }
}
