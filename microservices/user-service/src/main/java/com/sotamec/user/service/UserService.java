package com.sotamec.user.service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User createUser(UserRequest request) {
        User user = new User();
        user.setName(request.name);
        user.setEmail(request.email);
        user.setPassword(request.password);

        return repo.save(user);
    }
}