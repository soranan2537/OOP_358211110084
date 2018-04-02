package oop_lab9;

public class cow {

    public class Cow extends Pet {
        public Cow(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeNoise() {
            System.out.println("More More !!!");
        }

    }
