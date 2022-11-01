package com.gorter.myquizapp.screenTests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.gorter.myquizapp.QuizQuestionsActivity
import com.gorter.myquizapp.robots.quizQuestions
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class QuizQuestionsScreenTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(QuizQuestionsActivity::class.java)

    @Test
    fun titleIsShown() {
        quizQuestions {
            isOnQuestionsScreen()
        }
    }

    @Test
    fun canAnswerQuestion(){
        quizQuestions {
            titleIsShown()
            selectAnswer(1)
            clickSubmit()
        }
    }
}