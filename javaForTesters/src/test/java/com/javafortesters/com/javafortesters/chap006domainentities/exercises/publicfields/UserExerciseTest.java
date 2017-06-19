package com.javafortesters.com.javafortesters.chap006domainentities.exercises.publicfields;


import com.javafortesters.domainentieties.UserExercise;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserExerciseTest {
    @Test
    public void CanFieldBePublic() {
        UserExercise user = new UserExercise();
    }
    @Test
    public void CanUsePublicMethodForUsername() {
        UserExercise user = new UserExercise();
        user.username = "bob";
        assertEquals("not default username", "bob", user.username);
    }
    @Test
    public void CanUsePublicMethodFotPassword() {
        UserExercise user = new UserExercise();
        user.password = "1221";
        assertEquals("not default password", "1221", user.password);
        }
    }