/* Identify WebElements for use on the Template Page and any methods unique to action on this page */

//Note this page is just a copy example of using the login page 

package main.java.com.cerner.platform.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;



public class TemplatePage {

  // Locate the "Username" field
  @FindBy(id = "j_username")
  public WebElement username;

  // Locate the "Password" field
  @FindBy(id = "j_password")
  public WebElement password;

  // Locate the "Log In" button
  @FindBy(id = "loginButton")
  public WebElement login;

  // Method to enter username and password in the corresponding test box
  public TemplatePage enterUsernamePassword(String username, String password) {
    this.username.sendKeys(username);
    this.password.sendKeys(password);
    return this;
  }

}