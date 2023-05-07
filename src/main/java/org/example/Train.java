package org.example;

import java.util.List;

public class Train {

    private List<List<Integer>> input = List.of(List.of(0, 0, 0), List.of(0, 0, 0), List.of(0, 0, 0));
    private List<List<String>> input2 = List.of(List.of("O", "X", "O"), List.of("X", "X", "O"), List.of("X", "O", "O"));

    public Train() {
    }


    public String ticTacToe(List<List<GameCell>> input) {

        int result = input.size();

        //100
        //111
        //-100

        int horizontalCounter = 0;

        int leftToRight = 0;
        int rightToLeft = 0;
        int numer = input.size();

        for (int i = 0; i < input.size(); i++) {
            int horizontal = 0;
            int vertical = 0;

            leftToRight += input.get(i).get(i).value;
            rightToLeft += input.get(i).get(numer - 1).value;
            numer--;

            for (int j = 0; j < input.size(); j++) {
                horizontal += input.get(i).get(j).value;
                vertical += input.get(j).get(i).value;
            }

            if (horizontal == 3 || vertical == 3) {
                return "X win";
            } else if (horizontal == -3 || vertical == -3) {
                return "O win";
            }
        }
        return "Draw";
    }

    public String ticTacToeAdvanced(List<List<String>> input) {

        StringBuilder resultHorizontal = new StringBuilder();
        StringBuilder resultVertical = new StringBuilder();
        StringBuilder leftToRight = new StringBuilder();
        StringBuilder rightToLeft = new StringBuilder();
        int rightToLeftCounter = input.size();
        List<List<String>> input2 = List.of(List.of("O", "X", "O"), List.of("X", "X", "O"), List.of("X", "O", "O"));


        for (int i = 0; i < input.size(); i++) {
            resultHorizontal.append(" ");
            resultVertical.append(" ");
            leftToRight.append(input.get(i).get(i));
            rightToLeft.append(input.get(i).get(rightToLeftCounter -1));

            for (int j = 0; j < input.get(i).size(); j++) {
                resultHorizontal.append(input.get(i).get(j));
                resultVertical.append(input.get(j).get(i));
            }
            rightToLeftCounter--;
        }
        System.out.println("resultHorizontal: " + resultHorizontal);
        System.out.println("resultVertical: " + resultVertical);
        System.out.println("leftToRight: " + leftToRight);
        System.out.println("rightToLeft: " + rightToLeft);

        if (resultHorizontal.toString().contains("XXX") || resultVertical.toString().contains("XXX")
        || leftToRight.toString().contains("XXX") || rightToLeft.toString().contains("XXX")) {
            return "X win";
        }
        if (resultHorizontal.toString().contains("OOO") || resultVertical.toString().contains("OOO")
            || leftToRight.toString().contains("OOO") || rightToLeft.toString().contains("OOO")) {
            return "O win";
        }
        return "Draw";
    }
}
