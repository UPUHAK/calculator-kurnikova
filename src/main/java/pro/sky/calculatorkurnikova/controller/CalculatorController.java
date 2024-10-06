package pro.sky.calculatorkurnikova.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculatorkurnikova.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны!";
        }

        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны!";
        }

        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны!";
        }

        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны!";
        }
        if (num2 == 0) {
            return "Делить на 0 нельзя!";
        }

        return calculatorService.divide(num1, num2);
    }


}
