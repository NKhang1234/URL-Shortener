package com.khangpham.urlshoterner;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final NotificationService notiService;
    private final UserRepository userRepository;

    public UserService(
            NotificationService notiService,
            UserRepository userRepository
    ) {
        this.notiService = notiService;
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        this.userRepository.save(user);
        this.notiService.send("Successfully register", user.getEmail());
    }
}
