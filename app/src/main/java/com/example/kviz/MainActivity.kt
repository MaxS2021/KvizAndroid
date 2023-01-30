package com.example.kviz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast




class MainActivity : AppCompatActivity() {

    var questionNo = 0
//    val textView = findViewById<TextView>(R.id.textView)
//
    var questions = listOf("Каковы два официальных языка для разработки Android? \n\n " +
            "A) Kotlin и Java \n\n B) Java и Python \n\n C) Kotlin и Python",
        "Как вы определяете функцию в Kotlin? \n\n A) void \n\n B) var \n\n C) fun",
        "Для чего используется переменная? \n\n A) Хранить данные \n\n B) Для вставки случайного значения \n\n C) Что бы найти её значение",
        "Что означает SDK в Android SDK?? \n\n A) Software Development Kit \n\n B) Software Development Kotlin \n\n C) Something Don't Know")

    var rightAnswers = listOf(1, 3, 1, 1)

    fun showToast(answer: Int, textView: TextView) {
        if (answer== rightAnswers[questionNo]) {
            Toast.makeText(applicationContext, "ПРАВИЛЬНО! $questionNo", Toast.LENGTH_SHORT).show()
            updateQuestion(textView)
            //return 1
        } else {
            Toast.makeText(applicationContext, "ОТВЕТ НЕ ВЕРНЫЙ!", Toast.LENGTH_SHORT).show()
            //return 0
        }
    }
//
    fun updateQuestion(textView: TextView) {
        questionNo = questionNo + 1
        textView.setText(questions.get(questionNo))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(questions.get(questionNo))
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)


        button.setOnClickListener {
            showToast(1, textView)
        }

        button2.setOnClickListener {
            showToast(2, textView)
        }

        button3.setOnClickListener {
            showToast(3, textView)
        }


//        button.setOnClickListener {
//            Toast.makeText(applicationContext,"CORRECT!",Toast.LENGTH_SHORT).show()
//        }
//
//        button2.setOnClickListener {
//            Toast.makeText(applicationContext, "WRONGO!", Toast.LENGTH_SHORT).show()
//        }
//
//        button3.setOnClickListener {
//            Toast.makeText(applicationContext, "WRONGO!", Toast.LENGTH_SHORT).show()
//        }

    }



}