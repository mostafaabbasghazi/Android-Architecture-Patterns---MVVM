package com.calco.mykotlin.repo

import androidx.lifecycle.MutableLiveData
import com.calco.mykotlin.model.Person
import java.util.*

class CalcAgeImp:CalcAge {
    override fun calcAge(name: String, age: String):MutableLiveData<Person> {
        val info=MutableLiveData<Person>()
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        val yourAge=currentYear-age.toInt()
        val person=Person(name,yourAge)
        info.postValue(person)
        return info
    }
}