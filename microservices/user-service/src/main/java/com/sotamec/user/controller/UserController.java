package com.sotamec.user.controller;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @PostMapping
    public User create(@RequestBody UserRequest request) {
        return service.createUser(request);
    }
}