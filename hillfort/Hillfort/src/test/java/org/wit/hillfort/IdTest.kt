package org.wit.hillfort

import org.hamcrest.Matcher
import org.hamcrest.core.Is
import org.junit.Test
import org.wit.hillfort.models.HillfortModel

class IdTest {
    private val checkActivity = HillfortModel()

    @Test
    fun testActivity() {
        val testSmth = checkActivity.id
        assertThat(testSmth, Is.`is`(true))
    }

    private fun assertThat(testSmth: Long, empty: Matcher<Boolean>) {


    }
}