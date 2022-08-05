package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("not found user");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("not validate user" + "the name has less than three characters");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Andrei Golub", true)};
        try {
            User user = findUser(users, "Andrei Golub");
            if (validate(user)) {
                System.out.println("This user has access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
            System.out.println("not found user" + "the name has less than three characters");
        } catch (ElementNotFoundException enf) {
            enf.printStackTrace();
            System.out.println("not validate user");
        }
    }
}
