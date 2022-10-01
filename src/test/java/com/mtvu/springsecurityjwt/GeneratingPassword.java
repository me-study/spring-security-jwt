package com.mtvu.springsecurityjwt;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratingPassword {
    @Test
    void generatingPassword() {
        String encoded = new BCryptPasswordEncoder().encode("thisisapassword");
        System.out.print(encoded);
    }
}
