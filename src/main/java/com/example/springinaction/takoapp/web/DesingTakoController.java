package com.example.springinaction.takoapp.web;

import ch.qos.logback.core.model.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
@RequestMapping("/design")
public class DesingTakoController {

    @ModelAttribute
    public void  addIngrediententsModel(Model model){

    }

}
