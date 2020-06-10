package org.wit.hillfort

import android.util.Log
import org.hamcrest.core.Is.`is`
import org.junit.Assert.*
import org.junit.Test
import org.wit.hillfort.activities.HillfortLoginActivity
import org.wit.hillfort.activities.HillfortRegisterActivity

class RegistrationTest{
    private val registrationCheck = HillfortLoginActivity()

    @Test
    fun checkMail(){
        print("Testing email")
        val mail = registrationCheck.signInWithEmailAndPassword("test@gmail.com")
        print(mail)
        assertThat(mail, `is`(true))
    }
    @Test
    fun checkPassword(){
        print("test password")
        val password = registrationCheck.isPasswordValid("123456", "123456")
        assertThat(password, `is`(true))

    }
}