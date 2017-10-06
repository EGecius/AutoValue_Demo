package com.egecius.autovalue_demo;

import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.Test;


public class UserTest {
    
    @Test
    public void createWithStaticMethod() {
        User user = User.of("john", "smith");

        assertThat(user.firstName()).isEqualTo("john");
        assertThat(user.lastName()).isEqualTo("smith");
    }

}