package week13;

import java.util.Scanner;

public class Password {
  private String password;
  public Password(){}
    Scanner input = new Scanner(System.in);

  public String getPassword(){
      if (password==null){
          System.out.println("Password is null. Assign a value");
          password = input.next();
      } else {
          System.out.println("It has a value now.");
      }
      return password;
  }

  public void setPassword(String password){
      this.password= password;
  }
}
