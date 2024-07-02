import java.util.Scanner;

public class UsernameandPassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter username: ");
        String username = scanner.nextLine();

  
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        
        boolean isUsernameValid = validateUsername(username);

        boolean isPasswordValid = validatePassword(password);

       
        if (isUsernameValid && isPasswordValid) {
            System.out.println("Login credentials are valid.");
        } else {
            System.out.println("Invalid login credentials. Please check the rules.");
        }

        scanner.close();
    }


    public static boolean validateUsername(String username) {
     
        String usernamePattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@&$#%])[A-Za-z\\d@&$#%]{8,16}$";
        return username.matches(usernamePattern);
    }

  
    public static boolean validatePassword(String password) {
      
        return password.length() >= 8;
    }
}
