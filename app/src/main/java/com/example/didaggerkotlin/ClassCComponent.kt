package com.example.didaggerkotlin

import dagger.Component

@Component(modules = [ClassABModule::class])
interface ClassCComponent {
    fun getClassCInstance():ClassC
}