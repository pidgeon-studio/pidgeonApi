package com.pidgeon.api;

public class SMSResponse {
  private final String recipient;
  private final String message;

  public SMSResponse(String recipient, String message) {
    this.recipient = recipient;
    this.message = message;
  }

  public String getRecipient() {
    return recipient;
  }

  public String getMessage() {
    return message;
  }
}