package me.dio.Service;

import me.dio.Models.User;

public interface UserService {
    User findById(Long is) ;
    User create(User userToCreate) throws IllegalAccessException;
}
