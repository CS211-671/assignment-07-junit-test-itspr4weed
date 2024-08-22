package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList users;

    @BeforeEach
    void init() {
        users = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        users.addUser("EZ2WIN", "GGEZ555!");
        users.addUser("Condo12", "password");
        users.addUser("Benjyfish", "mala2you");

        // TODO: find one of them
        User user = users.findUserByUsername("Condo12");

        // TODO: assert that UserList found User
         String expected = "Condo12";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        users.addUser("EZ2WIN", "GGEZ555!");
        users.addUser("Condo12", "password");
        users.addUser("Benjyfish", "mala2you");

        // TODO: change password of one user
        boolean actual = users.changePassword("Condo12", "password", "newPassword123");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        users.addUser("EZ2WIN", "GGEZ555!");
        users.addUser("Condo12", "password");
        users.addUser("Benjyfish", "mala2you");

        // TODO: call login() with correct username and password
        User user = users.login("EZ2WIN", "GGEZ555!");

        // TODO: assert that User object is found
        String expected = "EZ2WIN";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        users.addUser("EZ2WIN", "GGEZ555!");
        users.addUser("Condo12", "password");
        users.addUser("Benjyfish", "mala2you");

        // TODO: call login() with incorrect username or incorrect password
        User actual = users.login("Benjyfish", "Mala2you");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}