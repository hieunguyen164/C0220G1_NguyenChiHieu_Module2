package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.CalculateService;

@Controller
public class ConverterController {
    @Autowired
    CalculateService calculateService;
    @GetMapping("/convert")
    public String cal(@RequestParam("rate") String rate, @RequestParam("usd") String usd, Model model){
        double result = calculateService.calculator(Double.parseDouble(rate),Double.parseDouble(usd));
        model.addAttribute("convertResult",result);
        return "index";
    }

}
