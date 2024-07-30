package com.calco.mykotlin.repo

import androidx.lifecycle.MutableLiveData
import com.calco.mykotlin.model.Person

interface CalcAge {
    fun calcAge(name:String,age:String):MutableLiveData<Person>
}