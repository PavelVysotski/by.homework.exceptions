package userValidation;

public class App {
    public static void main(String[] args) {
        User user1 = new User("Петр", "Петров", 25);
        User user2 = new User("Михаил", "МихайлоПетровинский", 47);
        User user3 = new User("Ту", "Тутович", 54);
        User user4 = new User("Александр", "Александров", 121);

        try {UserValidationService.checkUser(user2);}
        catch (UserValidationException e) {
            System.err.println(e.getMessage());
        }
    }
}
