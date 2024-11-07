package com.example.trainingassistant.utils

import android.os.CountDownTimer

class TrainingTimer(private val startTimeInMillis: Long, private val listener: TimerListener) {
    private var timeLeftInMillis: Long = startTimeInMillis
    private var countDownTimer: CountDownTimer? = null

    fun start() {
        countDownTimer = object : CountDownTimer(timeLeftInMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeftInMillis = millisUntilFinished
                listener.onTick(millisUntilFinished)
            }

            override fun onFinish() {
                listener.onFinish()
            }
        }.start()
    }

    fun stop() {
        countDownTimer?.cancel()
    }
}

interface TimerListener {
    fun onTick(millisUntilFinished: Long)
    fun onFinish()
}
