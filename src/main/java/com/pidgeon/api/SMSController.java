package com.pidgeon.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class SMSController {
  @Value("${pidgeon.path}")
  private String path;

  @RequestMapping(value = "/send", method = RequestMethod.POST)
  public SMSModel send(@RequestBody SMSModel smsModel) {
    try {
      String fullPath = path + smsModel.getRecipient() + ".txt";
      String csn      = "UTF-8";

      PrintWriter writer = new PrintWriter(fullPath, csn);
      writer.println("To: " + smsModel.getRecipient());
      writer.println(smsModel.getMessage());
      writer.close();
    } catch (IOException e) {}

    return smsModel;
  }
}
