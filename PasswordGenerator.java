import java.util.Random;

public class PasswordGenerator {
    
public static String generatePassword(int length) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=<>?";
        
        // Combine all character types
        String allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;
        
        // Create a random object
        Random random = new Random();
        
        // StringBuilder to build the password
        StringBuilder password = new StringBuilder();
        
        // Add at least one character from each character set
        password.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));
        password.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        
        // Add remaining characters randomly from the combined set
        for (int i = 4; i < length; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }
        
        // Shuffle the password characters
        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 12; // Specify desired length of the password
        String password = generatePassword(passwordLength);
        System.out.println("Generated Random Password: " + password);
    }
}
