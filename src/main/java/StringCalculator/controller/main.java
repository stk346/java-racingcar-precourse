package StringCalculator.controller;

import StringCalculator.model.Calculator;
import StringCalculator.model.InputReceiver;

import java.util.List;

public class main {
    public static void main(String[] args) {
        InputReceiver inputreceiver = new InputReceiver();
        Calculator calculator = new Calculator();
        List<String> userInput = inputreceiver.getUserInput();
        int result = calculator.doSumArray(userInput);
        System.out.println(result);
    }
}