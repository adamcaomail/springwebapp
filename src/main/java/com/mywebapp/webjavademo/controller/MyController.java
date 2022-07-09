package com.mywebapp.webjavademo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MyController {

  @GetMapping("/hi")
  public String sayHi() {
    return "hello world spring app";
  }

  @GetMapping("/hi/{name}")
  public String sayHelloOne(@PathVariable String name) {
    return "hi, nice to meet you " + name;
  }
}
