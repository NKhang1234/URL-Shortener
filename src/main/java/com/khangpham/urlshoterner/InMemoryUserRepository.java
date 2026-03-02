package com.khangpham.urlshoterner;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository{
    private HashMap<String, User> memory = new HashMap<String, User>();
    @Override
    public void save(User user) {
        memory.put(user.getEmail(), user);
        System.out.println("Save user to memory: " + memory);
    }
}
