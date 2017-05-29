import java.io.*;
import java.util.*;

public class Reverse {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Hi, I repeat messages backwards. What have you got to say?");
    String userInput = console.readLine();
    char[] characterArray = userInput.toCharArray();

    for (int i = characterArray.length - 1; i >= 0; i--){
    System.out.print(characterArray[i]);
    }

  }
}
