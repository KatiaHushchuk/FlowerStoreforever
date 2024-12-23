package ua.edu.ucu.apps.flowerstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.model.AppUser;
import ua.edu.ucu.apps.flowerstore.service.AppUserService;

@RestController
@RequestMapping("/api/v1")
public class AppUserController {

    private AppUserService userService;

    @Autowired
    public AppUserController(AppUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<AppUser> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/user")
    public AppUser creatUser(@RequestBody AppUser user) {
        return userService.creatUser(user);
    }

    @GetMapping("/user/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        AppUser userByEmail = userService.getUserByEmail(email);

        if (userByEmail != null) {
            return ResponseEntity.ok(userByEmail);
        }

        return ResponseEntity.notFound().build();

    }
}