package org.wit.hillfort


//import org.hamcrest.collection.IsEmptyCollection.empty
import org.junit.Test
import org.wit.hillfort.models.UserModel
import java.util.*
import java.util.Optional.empty

class AppSettingsUnitTest {
    private val checkActivity = UserModel()
    @Test
    fun testActivity(){
        val testSmth = checkActivity.email()
        assertThat(testSmth, empty())

    }

    private fun assertThat(testSmth: Unit, empty: Optional<Any>) {

    }


}

internal operator fun String.invoke() {

}

