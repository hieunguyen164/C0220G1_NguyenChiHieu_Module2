package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.DictionaryService;

@Controller
public class DictionaryController {
    @Autowired
    DictionaryService dictionaryService;
    @GetMapping("/translate")
    private String searching(@RequestParam("txtSearch") String txtSearch, Model model ){
        String result = dictionaryService.search(txtSearch);
        if(result == null){
            model.addAttribute("message","Not found");
        }else{
            model.addAttribute("word",txtSearch);
            model.addAttribute("result",result);
        }
        return "result";
    }
}
