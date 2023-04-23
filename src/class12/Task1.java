package class12;

public class Task1 {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "pass123";
        String confPassword = password;
        if (userName.isBlank() || password.isBlank()) {

            System.out.println("Username or Password cannot be empty");

        }else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password == userName) {
            System.out.println("Password cannot contain username");
        }
        if (!password.equals(confPassword)) {
            System.out.println("Passwords do not match");

        } else {
            System.out.println("Your username and password has been created");
        }
    }
}
