package com.yogesh.studentsystem.service;


import com.yogesh.studentsystem.controller.dto.UserRegistrationDto;
import com.yogesh.studentsystem.model.User;
import com.yogesh.studentsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user= new User();
        user.setFirstName(registrationDto.getFirstName());
        user.setLastName(registrationDto.getLastName());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());
        user.setRoles(registrationDto.getRole());
        return userRepository.save(user);
    }

    @Override
    public User loadUserByUsername(String username){
        User user = userRepository.findByEmail(username);
        return user;
    }

}
