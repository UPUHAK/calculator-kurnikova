package pro.sky.calculatorkurnikova;


import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "<b>Hello</b>";
    }

    public String answerHello(String userName) {
        return "Привет, " + userName;
    }
}
