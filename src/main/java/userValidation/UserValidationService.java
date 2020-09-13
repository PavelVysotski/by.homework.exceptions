package userValidation;

public class UserValidationService {

    public static void checkUser(User user) {
        if (user.getFirstName().length() < 3 || user.getLastName().length() < 3 || user.getFirstName().length() > 15
                || user.getLastName().length() > 15 || user.getAge() <= 0 || user.getAge() >= 120) {
            throw new UserValidationException(user + "Параметры данного пользователя недопустимы.");
        } else {
            System.out.println(user + "Параметры данного пользователя в порядке.");
        }
    }
}
