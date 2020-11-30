package com.vtb.java.challenge.competitor.obstacles;

import com.vtb.java.challenge.competitor.interfaces.Obstacle;
import com.vtb.java.challenge.competitor.interfaces.Performable;

public class RunningTrack implements Obstacle {

    private int runLength;

    public RunningTrack(int runLength) {
        this.runLength = runLength;
    }

    @Override
    public void overcomeBarrier(Performable performables) {
        performables.run(runLength);
    }

    @Override
    public String toString() {
        return "RunningTrack{" +
                "runLength=" + runLength +
                '}';
    }

}
