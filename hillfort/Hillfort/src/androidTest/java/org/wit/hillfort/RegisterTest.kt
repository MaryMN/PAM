package org.wit.hillfort

import org.wit.hillfort.activities.HillfortRegisterActivity
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId

import org.junit.Rule
import org.junit.Test


class RegisterTest {

    @get:Rule
    var intentsRule: IntentsTestRule<HillfortRegisterActivity> = IntentsTestRule(HillfortRegisterActivity::class.java)


    @Test
    fun verifyRegisterScreen() {
        onView(withId(R.id.enteredName))
                .perform(typeText("admin"), closeSoftKeyboard())

        onView(withId(R.id.enteredEmail))
                .perform(typeText("munteanu.maria98@gmail.com"), closeSoftKeyboard())

        onView(withId(R.id.enteredPassword))
                .perform(typeText("adminuska"), closeSoftKeyboard())

        onView(withId(R.id.enteredPasswordConfirm))
                .perform(typeText("adminuska"), closeSoftKeyboard())

        onView(withId(R.id.registerButton)).perform(click())

    }


}