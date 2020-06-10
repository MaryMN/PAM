package org.wit.hillfort

import org.wit.hillfort.activities.HillfortLoginActivity
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId

import org.junit.Rule
import org.junit.Test


class LoginTest {

    /* Instantiate an IntentsTestRule object. */
    @get:Rule
    var intentsRule: IntentsTestRule<HillfortLoginActivity> = IntentsTestRule(HillfortLoginActivity::class.java)


    @Test
    fun verifyLoginScreen() {

        onView(withId(R.id.enteredEmail))
                .perform(typeText("munteanu.maria98@gmail.com"), closeSoftKeyboard())

        onView(withId(R.id.enteredPassword))
                .perform(typeText("adminuska"), closeSoftKeyboard())

        onView(withId(R.id.loginButton)).perform(click())

    }




}