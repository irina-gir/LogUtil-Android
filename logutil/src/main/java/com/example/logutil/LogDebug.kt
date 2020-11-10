package com.example.logutil

import android.util.Log

class LogDebug {

    fun d(message: String){
        Log.d(TAG, message)
    }

    companion object{
        const val TAG = "SUPER_AWESOME_APP"
    }

}