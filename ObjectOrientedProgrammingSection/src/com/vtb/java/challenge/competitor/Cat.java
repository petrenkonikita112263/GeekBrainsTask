package com.vtb.java.challenge.competitor;

import com.vtb.java.challenge.competitor.interfaces.Performable;

public class Cat implements Performable {

    private String name;
    private int runLimit;
    private int jumpLimit;
    private boolean can;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        can = true;
    }

    @Override
    public void jump(int distance) {
        if (can) {
            if (jumpLimit == 0) {
                System.out.println(name + " can't jump");
                can = false;
                return;
            }
            if (distance <= jumpLimit) {
                System.out.println(name + " successfully jump to " + distance);
            } else {
                System.out.println("The distance for " + name + " is so big for jumping");
                can = false;
            }
        }
    }

    @Override
    public void run(int distance) {
        if (can) {
            if (runLimit == 0) {
                System.out.println(name + " can't run");
                can = false;
                return;
            }
            if (distance <= runLimit) {
                System.out.println(name + " successfully run to " + distance);
            } else {
                System.out.println("The distance to run is big for " + name);
                can = false;
            }
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", runLimit=" + runLimit +
                ", jumpLimit=" + jumpLimit +
                '}';
    }
}
