public class Main {
    public static void main(String[] args) {
        try {
            validateCredentials("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static void validateCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]*")) {
            throw new WrongLoginException("Логин недействителен");
        }

        if (!password.equals(confirmPassword) || password.length() > 20 || !password.matches("[a-zA-Z0-9_]*")) {
            throw new WrongPasswordException("Пароль недействителен");
        }
    }
}