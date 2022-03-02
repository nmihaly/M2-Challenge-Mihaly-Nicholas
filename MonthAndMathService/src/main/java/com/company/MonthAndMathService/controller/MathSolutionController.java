package com.company.MonthAndMathService.controller;

import com.company.MonthAndMathService.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
;

@RestController
public class MathSolutionController {



    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution createAddSolution(@RequestBody @Valid MathSolution input) {
      int answer = input.getOperand1() + input.getOperand2();
//      if (input.getOperand1() && input.getOperand2() != INt)
      return new MathSolution(input.getOperand1(),input.getOperand2(),"add", answer);

    }

    @PostMapping("/subtract")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution createSubtractSolution(@RequestBody @Valid MathSolution input) {

        int answer = input.getOperand1() - input.getOperand2();
        return new MathSolution(input.getOperand1(),input.getOperand2(),"subtract", answer);

    }

    @PostMapping("/multiply")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution createMultiplySolution(@RequestBody @Valid MathSolution input) {

        int answer = input.getOperand1() * input.getOperand2();
        return new MathSolution(input.getOperand1(),input.getOperand2(),"multiply", answer);

    }

    @PostMapping("/divide")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution createDivideSolution(@RequestBody @Valid MathSolution input) {

        int answer = input.getOperand1() / input.getOperand2();
        if (input.getOperand2() == 0)
            throw new ArithmeticException("Cannot divide by zero");
        return new MathSolution(input.getOperand1(),input.getOperand2(),"divide", answer);

    }


}
