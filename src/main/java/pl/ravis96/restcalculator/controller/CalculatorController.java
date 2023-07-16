package pl.ravis96.restcalculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.ravis96.restcalculator.operator.OperatorType;
import pl.ravis96.restcalculator.record.CalculateRespond;
import pl.ravis96.restcalculator.service.CalculatorService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/add/{input}")
    public CalculateRespond add(@PathVariable int input) {
        return this.calculatorService.calculate(OperatorType.ADD, input);
    }

    @GetMapping("/subtract/{input}")
    public CalculateRespond subtract(@PathVariable int input) {
        return this.calculatorService.calculate(OperatorType.SUBTRACT, input);
    }

    @GetMapping("/multiply/{input}")
    public CalculateRespond multiply(@PathVariable int input) {
        return this.calculatorService.calculate(OperatorType.MULTIPLY, input);
    }

    @GetMapping("/divide/{input}")
    public CalculateRespond divide(@PathVariable int input) {
        return this.calculatorService.calculate(OperatorType.DIVIDE, input);
    }
}
