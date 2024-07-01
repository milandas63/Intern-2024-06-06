import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class LoginException extends RuntimeException {
    LoginException(String message) {
        super(message);
    }
}

class UsernameException extends LoginException {
    UsernameException(String message) {
        super(message);
    }
}

class BlankUsernameException extends UsernameException {
    BlankUsernameException() {
        super("Username cannot be blank");
    }
}

class NotUppercaseAlphabeticFirstCharacterException extends UsernameException {
    NotUppercaseAlphabeticFirstCharacterException() {
        super("Username must start with an uppercase alphabetic character");
    }
}

class TooShortUsernameException extends UsernameException {
    TooShortUsernameException() {
        super("Username must be at least 8 characters");
    }
}

class TooLongUsernameException extends UsernameException {
    TooLongUsernameException() {
        super("Username must be at most 16 characters");
    }
}

class InvalidCharacterInUsernameException extends UsernameException {
    InvalidCharacterInUsernameException() {
        super("Username must contain at least 1 uppercase, 1 lowercase, 1 digit, and 1 special character");
    }
}

class PasswordException extends LoginException {
    PasswordException(String message) {
        super(message);
    }
}

class BlankPasswordException extends PasswordException {
    BlankPasswordException() {
        super("Password cannot be blank");
    }
}

class TooShortPasswordException extends PasswordException {
    TooShortPasswordException() {
        super("Password must be at least 8 characters");
    }
}

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+---------------------------------------------------+");
        System.out.println("|                                                   |");
        System.out.println("|   LOGIN                                           |");
        System.out.println("|   -----                                           |");
        System.out.println("|                                                   |");
        System.out.print("|   Username: ");
        String username = scanner.nextLine();
        System.out.print("|   Password: ");
        String password = scanner.nextLine();
        System.out.println("|                                                   |");
        System.out.println("|                                                   |");
        System.out.println("|                                                   |");
        System.out.println("|                                                   |");
        System.out.println("+---------------------------------------------------+");

        try {
            validateUsername(username);
            validatePassword(password);
            System.out.println("Login successful");
        } catch (LoginException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }

    private static void validateUsername(String username) throws UsernameException {
        if (username.isEmpty()) {
            throw new BlankUsernameException();
        }
        if (!Character.isUpperCase(username.charAt(0))) {
            throw new NotUppercaseAlphabeticFirstCharacterException();
        }
        if (username.length() < 8) {
            throw new TooShortUsernameException();
        }
        if (username.length() > 16) {
            throw new TooLongUsernameException();
        }
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$#%]).*$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(username);
        if (!m.find()) {
            throw new InvalidCharacterInUsernameException();
        }
    }

    private static void validatePassword(String password) throws PasswordException {
        if (password.isEmpty()) {
            throw new BlankPasswordException();
        }
        if (password.length() < 8) {
            throw new TooShortPasswordException();
        }
    }
}