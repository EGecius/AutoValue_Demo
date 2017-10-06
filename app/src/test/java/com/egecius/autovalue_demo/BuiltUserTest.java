package com.egecius.autovalue_demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BuiltUserTest {


    @Test
    public void demoBuiltUser() {

        BuiltUser builtUser = BuiltUser.builder()
                .firstName("john")
                .lastName("smith")
                .build();

        assertThat(builtUser.firstName()).isEqualTo("john");
        assertThat(builtUser.lastName()).isEqualTo("smith");
    }

    @Test
    public void demoDefaultValues() {

        BuiltUser builtUser = BuiltUser.builder()
                .build();

        assertThat(builtUser.firstName()).isEqualTo("unknown");
        assertThat(builtUser.lastName()).isEqualTo("unknown");
    }

}