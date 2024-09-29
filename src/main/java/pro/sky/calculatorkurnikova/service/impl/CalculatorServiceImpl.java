package pro.sky.calculatorkurnikova.service.impl;


import org.springframework.stereotype.Service;
import pro.sky.calculatorkurnikova.service.CalculatorService;


@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcome() {
        return "Добро пожаловать в калькулятор.";
    }

    @Override
    public String plus(int i, int i1) {
        return i + " + " + i1 + " = " + (i + i1);
    }

    @Override
    public String minus(int i, int i1) {
        return i + " - " + i1 + " = " + (i - i1);
    }

    @Override
    public String multiply(int i, int i1) {
        return i + " * " + i1 + " = " + (i * i1);
    }

    @Override
    public String divide(int i, int i1) {
        return i + " / " + i1 + " = " + (i / i1);
    }


}
