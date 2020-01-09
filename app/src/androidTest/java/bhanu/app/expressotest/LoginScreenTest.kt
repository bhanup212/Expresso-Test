package bhanu.app.expressotest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginScreenTest {

    @Rule @JvmField var activity: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setUp(){
        activity.activity
    }
    @Test
    fun isAllLoginFieldsVisible(){

        onView(withId(R.id.hello_world)).check(matches(isDisplayed()))
    }
    @Test
    fun checkLoginTitle(){
        onView(withId(R.id.hello_world)).check(matches(withText("Login here")))
    }
    @Test
    fun fillEditTexts(){
        onView(withId(R.id.full_name))
            .perform(typeText("Bhanu prakash"), closeSoftKeyboard())
        onView(withId(R.id.mobile_number))
            .perform(typeText("9494799454"), closeSoftKeyboard())

        onView(withId(R.id.login)).perform(click())
    }
}