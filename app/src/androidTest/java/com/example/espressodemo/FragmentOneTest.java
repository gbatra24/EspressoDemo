package com.example.espressodemo;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
public class FragmentOneTest {

    @Test
    public void testIsFragmentOneVisible() {

        FragmentScenario.launchInContainer(FragmentOne.class);

        onView(withId(R.id.btn_launch_frag2)).check(matches(withText("Launch fragment 2")));
    }
}