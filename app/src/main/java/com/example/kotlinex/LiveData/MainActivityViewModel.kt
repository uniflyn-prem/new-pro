package com.example.kotlinex.LiveData

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    private val seconds = MutableLiveData<Int>()
    private val finish = MutableLiveData<Boolean>()
    fun Seconds() : LiveData<Int>{
        return seconds
    }
    fun Finish() : LiveData<Boolean>{
        return finish
    }
    fun startCounter(){
        object :CountDownTimer(10000,100){
            override fun onTick(milliUtilsFinished: Long){
                val time = milliUtilsFinished/1000
                seconds.value = time.toInt()
            }
            override fun onFinish(){
                finish.value = true
            }
        }.start()
    }
}