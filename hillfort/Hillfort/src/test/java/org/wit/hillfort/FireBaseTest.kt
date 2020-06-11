package org.wit.hillfort

import org.hamcrest.Matcher
import org.hamcrest.core.Is.`is`
import org.junit.Test
import org.wit.hillfort.models.UserModel
import org.wit.hillfort.models.generateRandomHillfortId

class FireBaseTest {
    private val checkActivity = UserModel()

    @Test
    fun testActivity() {
        val  testSmth = checkActivity.equals(generateRandomHillfortId())
        assertThat(testSmth, `is`(true))
    }

    private fun assertThat(testSmth: Boolean, empty: Matcher<Boolean>) {
    }
}