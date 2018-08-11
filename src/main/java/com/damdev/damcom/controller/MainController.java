package com.damdev.damcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author : zenic
 * Created : 2018. 8. 11.
 */
@Controller
public class MainController {

  @RequestMapping("/")
  public String main() {
    return "welcome";
  }
}
