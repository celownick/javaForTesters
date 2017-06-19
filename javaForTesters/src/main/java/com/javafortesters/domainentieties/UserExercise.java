package com.javafortesters.domainentieties;


    public class UserExercise {
        public String password;
        public String username;

        public UserExercise() {
            username = "admin";
            password = "12345";
        }
        public String getPassword() {
            return password;
        }

    }