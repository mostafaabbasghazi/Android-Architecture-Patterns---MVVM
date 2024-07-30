package com.calco.mykotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.calco.mykotlin.model.Person
import com.calco.mykotlin.repo.CalcAge
import com.calco.mykotlin.repo.CalcAgeImp

class CalcViewModel:ViewModel(){
    val calcAgeRepo:CalcAge=CalcAgeImp()

    fun calcViewModel(name:String,age:String): LiveData<Person> {
        var personMutibleLiveData=calcAgeRepo.calcAge(name,age)
        return personMutibleLiveData
    }
}
