package racingcar.model;

import java.util.Random;

public class Car {
    private static final int BOUND = 10;
    private static final int GO_CONDITION = 4;

    private int score;
    private String name;

    Car(String name) {
        this.name = name;
        score = 0;
    }

    public String getName(){
        return name;
    }

    public int getScore() {
        return score;
    }

    private void go() {
        score++;
    }

    void attempt(){
        if (isAbleToMove()) {
            this.go();
        }
    }

    private boolean isAbleToMove() {
        Random random = new java.util.Random();
        return random.nextInt(BOUND) > GO_CONDITION;
    }
}
