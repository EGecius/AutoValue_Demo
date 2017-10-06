package com.egecius.autovalue_demo;

import com.google.auto.value.AutoValue;

/** User created with a Builder */
@AutoValue
public abstract class BuiltUser {

    abstract String firstName();
    abstract String lastName();

//does not compile since constructor is private with Builder
//    static BuiltUser of(String firstName, String lastName) {
//        return new AutoValue_BuiltUser(firstName, lastName);
//    }

    @AutoValue.Builder
    public abstract static class Builder {

        public abstract Builder firstName(String name);
        public abstract Builder lastName(String name);

        public abstract BuiltUser build();
    }
}
