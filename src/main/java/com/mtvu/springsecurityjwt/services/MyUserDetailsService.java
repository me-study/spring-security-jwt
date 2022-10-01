package com.mtvu.springsecurityjwt.services;

import com.mtvu.springsecurityjwt.entities.UserInfo;
import com.mtvu.springsecurityjwt.models.user.MyUserDetails;
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
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<UserInfo> user = userRepository.findByUserName(s);

        user.orElseThrow(() -> new UsernameNotFoundException("User not found: " + s));

        return user.map(MyUserDetails::new).get();
    }
}