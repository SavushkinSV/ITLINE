package ssv.home.itline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ssv.home.itline.exception.NotFoundException;
import ssv.home.itline.model.User;
import ssv.home.itline.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserResource {

    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public User findById(@PathVariable long userId) {
        return userService.findById(userId).orElseThrow(() -> new NotFoundException("User not found"));
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable long id, @RequestBody boolean status) {
        User user = userService.findById(id).orElseThrow(() -> new NotFoundException("User not found"));
        user.setStatus(status);
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void  delete(@PathVariable long id) {
        userService.delete(id);
    }

}
