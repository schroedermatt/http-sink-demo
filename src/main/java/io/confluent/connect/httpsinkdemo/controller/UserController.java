package io.confluent.connect.httpsinkdemo.controller;

import io.confluent.connect.httpsinkdemo.domain.User;
import io.confluent.connect.httpsinkdemo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class UserController {

  private final UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @PostMapping(path = "/api/messages")
  public ResponseEntity createMessage(@RequestBody String message) {
    log.info("MESSAGE RECEIVED: {}", message);

    return ResponseEntity
        .ok()
        .build();
  }

  @PostMapping(path = "/api/messages/batch")
  public ResponseEntity createMessages(@RequestBody List<String> messages) {
    log.info("MESSAGES RECEIVED: {}", messages);

    return ResponseEntity
        .ok()
        .build();
  }

  @GetMapping(path = "/api/users")
  public Iterable<User> getUsers() {
    return userRepository.findAll();
  }

  @PutMapping(path = "/api/users")
  public ResponseEntity putUsers(@RequestBody User user) {
    User updatedUser = userRepository.save(user);

    return ResponseEntity
        .ok()
        .body(updatedUser);
  }

  @PostMapping(path = "/api/users")
  public ResponseEntity createUser(@RequestBody User user) {
    User newUser = userRepository.save(user);

    return ResponseEntity
        .ok()
        .body(newUser);
  }

  @PostMapping(path = "/api/users/batch")
  public ResponseEntity createUsers(@RequestBody List<User> users) {
    Iterable<User> newUsers = userRepository.saveAll(users);

    return ResponseEntity
        .ok()
        .body(newUsers);
  }
}
