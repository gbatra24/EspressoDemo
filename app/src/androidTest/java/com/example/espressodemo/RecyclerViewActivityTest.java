package com.example.espressodemo;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
public class RecyclerViewActivityTest {

    @Test
    public void testIsRecyclerViewVisible() {
        ActivityScenario.launch(RecyclerViewActivity.class);
        onView(withId(R.id.rv_names)).check(matches(isDisplayed()));

        onView(withId(R.id.rv_names)).perform(RecyclerViewActions.actionOnItemAtPosition(1,
                ViewActions.click()));

//        RecyclerViewActions.scrollTo(ViewMatchers.withText(""));
    }
}