package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void init() {
        user = new User("johnyjohn", "john12345");
    }

    @Test
    void testIsUsername() {
        assertTrue(user.isUsername(user.getUsername()));
    }

    @Test
    void testSetPassword() {
        user = new User("john555");
        String password = user.getPassword();
        user.setPassword("12345678");
        assertNotEquals(password, user.getPassword());
    }

    @Test
    void testValidatePassword() {
        user = new User("john555", "12345678");
        assertTrue(user.validatePassword("12345678"));
    }

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }
}