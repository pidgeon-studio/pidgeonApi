package com.pidgeon.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class SMSController {

  @RequestMapping("/send")
  public SMSResponse send(@RequestParam(value = "name", defaultValue = "") String name) {
    try{
      PrintWriter writer = new PrintWriter("/Users/sarbull/work/sms/the-file-name.txt", "UTF-8");
      writer.println("The first line");
      writer.println("The second line");
      writer.close();
    } catch (IOException e) {
      // do something
    }


    return new SMSResponse("0727686700", "Hello from Spring Boot");
  }
}
