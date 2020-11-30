package com.vtb.java.lecture.interfaces;

public class LectureMainApp {

    static class Human {
        private Transport currentTransport;

        public void startMoving(Transport transport) {
            transport.start();
            this.currentTransport = transport;
        }

        public void stopMoving() {
            if (currentTransport != null) {
                currentTransport.stop();
                currentTransport = null;
            } else {
                System.out.println("The human doesn't move anywhere");
            }
        }

        public void enterTheStage(Transport transport) {
            if (!(transport instanceof Bicycle)) {
                System.out.println("Unfortunately, the human don't have bicycle");
                return;
            }
            Bicycle bicycle = (Bicycle) transport;
            bicycle.performMovement();
        }
    }

    static class Bicycle implements Transport, Action {
        @Override
        public void start() {
            System.out.println("The human starts riding the bicycle");
        }

        @Override
        public void stop() {
            System.out.println("The human stops riding the bicycle");
        }

        @Override
        public void performMovement() {
            System.out.println("The human performs some action on the bicycle");
        }
    }

    static class Car implements Transport {
        @Override
        public void start() {
            System.out.println("The human starts driving the bicycle");
        }

        @Override
        public void stop() {
            System.out.println("The human stops driving the car");
        }
    }

    public static void main(String[] args) {
        Transport lifeTransport = new Car();
        Human human = new Human();
        human.stopMoving();
        human.startMoving(lifeTransport);
        human.enterTheStage(lifeTransport);
        human.stopMoving();
        Transport bicycle = new Bicycle();
        human.startMoving(bicycle);
        human.enterTheStage(bicycle);
        human.stopMoving();

    }
}
