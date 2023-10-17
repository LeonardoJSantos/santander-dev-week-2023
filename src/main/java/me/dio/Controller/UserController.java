package me.dio.Controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import me.dio.Service.UserService;
import me.dio.Models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){

        this.userService = userService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);

    }
    @PostMapping("/{id}")
    public ResponseEntity<User> create(@RequestBody User userToCreated) throws IllegalAccessException {
        var userCreated = userService.create(userToCreated);
        URI location =ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
