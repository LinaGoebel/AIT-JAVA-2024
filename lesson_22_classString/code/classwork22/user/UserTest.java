package classwork22.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

  private String okEmail = "example@mail.com";
  private String notEmail = "exampleemail.com";
  private String okPassword = " qweerty1234";
  private String notPassword = "qweerty";

  @BeforeEach
  void setUp() {
  }

  @Test
  void setPassword() {
    User user = new User(okEmail, okPassword);
    Assertions.assertEquals(okEmail, user.getEmail());
    user = new User(notEmail, notPassword);
    Assertions.assertNull(user.getPassword());
  }

  @Test
  void setEmail() {
    User user = new User(okEmail, okPassword);
    Assertions.assertEquals(okEmail, user.getEmail());

    user = new User(notEmail, okPassword);
    Assertions.assertNull(user.getEmail());

  }
}