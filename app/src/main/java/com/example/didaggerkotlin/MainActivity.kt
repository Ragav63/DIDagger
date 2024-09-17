package com.example.didaggerkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        This one is tightly coupled
//        val classC = ClassC()
//        classC.startClassC()

//        //manual field injection it is not tightly coupled but their is a lot of code to write
//        val classC = ClassC()
//        classC.classA = ClassA()
//        classC.classB = ClassB()
//        classC.startClassC()

//        //manual constructor injection
//        val classA = ClassA()
//        val classB = ClassB()
//        val classC = ClassC(classA, classB)
//        classC.startClassC()

        //dagger injection
        DaggerClassCComponent.create().getClassCInstance().startClassC()
    }
}