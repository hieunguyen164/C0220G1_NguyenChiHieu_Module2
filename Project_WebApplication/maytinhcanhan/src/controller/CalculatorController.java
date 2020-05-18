package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalculatorService;

@Controller
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;
    @GetMapping("/")
    String getIndex(){
        return "index";
    }

    @RequestMapping("/calculate")
    public String calculate (@RequestParam("number1") String number1, @RequestParam ("number2")String number2, @RequestParam ("operand") String operand, Model model) {
        double result = calculatorService.calculate(Double.parseDouble(number1), Double.parseDouble(number2), operand);
        model.addAttribute("num1", number1);
        model.addAttribute("num2", number2);
        model.addAttribute("result", result);
        return "index";
    }

}
