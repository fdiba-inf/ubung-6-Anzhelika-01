package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean validPassword = false;
        boolean letterOrDigit = true;
        do{
        String password = input.nextLine();
        if(password.length() >= 0){
          for(int i = 0; i < password.length(); i++){
            char nextSymbol = password.charAt(i);
            if(!Character.isLetterOrDigit(nextSymbol)){
              letterOrDigit = false;
              break;
            }
          }
          if(letterOrDigit){
            int digitCount = 0;
            for (int i = 0; i < password.length(); i++){
              char nextSymbol = password.charAt(i);
              if(Character.isDigit(nextSymbol)){
                digitCount++;
              }
            }
            if(digitCount >= 2){
             validPassword = true;
            }

          }
        }
        }while(!validPassword);
        System.out.println("Password valid!");
    }
}
