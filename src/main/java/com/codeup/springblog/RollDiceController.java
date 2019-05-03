package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice/{num}")
    public String rollDice(@PathVariable int num, Model vmodel){

        int random = (int)(Math.random()*6+1);

        String result;

        if (random == num){
            result = "win";
        }else{
            result = "lost!";
        }

        vmodel.addAttribute("RandomNumber",random);
        vmodel.addAttribute("Result",result);

        //Sends to html
        return "dice";

    }
}
