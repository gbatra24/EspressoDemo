package com.example.espressodemo;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityEspressoTest {

    @Test
    public void testActivityNavigation() {
        ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.ll_second)).check(matches(isDisplayed()));

        onView(withId(R.id.etName)).perform(clearText(), typeText("Gagan"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button2)).perform(click());

//        onView(withId(R.id.ll_main)).check(matches(isDisplayed()));

    }

    @Test
    public void testFragmentInActivityNavigation() {
        ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.ll_frag1)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_launch_frag2)).perform(click());
        onView(withId(R.id.ll_frag2)).check(matches(isDisplayed()));

        pressBack();
        onView(withId(R.id.ll_frag1)).check(matches(isDisplayed()));
    }
}