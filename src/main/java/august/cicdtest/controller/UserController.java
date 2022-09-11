package august.cicdtest.controller;

import august.cicdtest.model.User;
import august.cicdtest.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(User user) {
        userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
