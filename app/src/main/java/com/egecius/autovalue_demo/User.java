package com.egecius.autovalue_demo;

import com.google.auto.value.AutoValue;


/** auto-generate by AutoValue */
@AutoValue
public abstract class User {

    abstract String firstName();
    abstract String lastName();

    static User of(String firstName, String lastName) {
        return new AutoValue_User(firstName, lastName);
    }
}
