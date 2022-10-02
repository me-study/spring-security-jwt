package com.mtvu.springsecurityjwt.services;

import com.mtvu.springsecurityjwt.entities.UserInfo;
import com.mtvu.springsecurityjwt.models.MyUserDetails;
import com.mtvu.springsecurityjwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> user = userRepository.findByUserName(username);

        return user.map(MyUserDetails::new).orElseThrow(
                () -> new UsernameNotFoundException("User not found: " + username));
    }
}