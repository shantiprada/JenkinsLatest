package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping("/greetings")
  public String index() {
    return "Now Cloud Foundry should work from jenkins time Hello World!!!";
  }
}