package com.egecius.autovalue_demo;

import static org.assertj.core.api.Assertions.assertThat;

import com.egecius.autovalue_demo.AutoValue_BuiltUser.Builder;

import org.junit.Test;

public class BuiltUserTest {


    @Test
    public void demoBuiltUser() {

        BuiltUser builtUser = new Builder()
                .firstName("john")
                .lastName("smith")
                .build();

        assertThat(builtUser.firstName()).isEqualTo("john");
        assertThat(builtUser.lastName()).isEqualTo("smith");
    }

}