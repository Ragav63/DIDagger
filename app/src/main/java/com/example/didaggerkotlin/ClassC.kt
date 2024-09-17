package com.example.didaggerkotlin

import android.util.Log
import javax.inject.Inject

//class ClassC {
//    private val classA = ClassA()
//    private val classB = ClassB()
//
//
//    fun startClassC(){
//        classA.startClassA()
//        classB.startClassB()
//        Log.i("TAG", "Class C is created")
//    }
//}

//code for manual di injection
//class ClassC {
//    lateinit var classA: ClassA
//    lateinit var classB: ClassB
//
//    fun startClassC(){
//        classA.startClassA()
//        classB.startClassB()
//        Log.i("TAG", "Class C is created")
//    }
//}

//Constructor Injection
//class ClassC(private val classA: ClassA, private val classB: ClassB){
//    fun startClassC(){
//        classA.startClassA()
//        classB.startClassB()
//        Log.i("TAG", "Class C is created")
//    }
//}
class ClassC @Inject constructor(private val classA: ClassA, private val classB: ClassB){
    fun startClassC(){
        classA.startClassA()
        classB.startClassB()
        Log.i("TAG", "Class C is created")
    }
}