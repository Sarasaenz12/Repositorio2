package Ejemplo1;

public class User {
        String BaseUser;
        String EnteredUser;
        String BasePassword;
        String EnteredPassword;
        Boolean SystemStatus;

        public User(String enteredUser, String enteredPassword) {
            this.BaseUser = "Juan";
            this.BasePassword = "1234";
            this.EnteredUser = enteredUser;
            this.EnteredPassword = enteredPassword;
            this.SystemStatus = false;
        }

        public String validateStatus() {
            if (BaseUser.equals(EnteredUser) && BasePassword.equals(EnteredPassword)) {
                System.out.println("Login successful");
                return "Login successful";
            } else {
                System.out.println("Login failed");
                return "Login failed";
            }
        }

        public Boolean allowAccess() {
            return validateStatus().equals("Login successful");
        }

        @Override
        public String toString() {
            return "User{" +
                    "BaseUser='" + BaseUser + '\'' +
                    ", EnteredUser='" + EnteredUser + '\'' +
                    ", BasePassword='" + BasePassword + '\'' +
                    ", EnteredPassword='" + EnteredPassword + '\'' +
                    ", SystemStatus=" + SystemStatus +
                    '}';
        }
    }


