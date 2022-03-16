package com.example.periodicworkertest

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class TestPeriodicWorker(appContext: Context,
                 workerParams: WorkerParameters
): Worker(appContext, workerParams) {
    override fun doWork(): Result {

        Log.i("PeriodicWorkerTest", "Periodic worker working...")
        return Result.success()
    }
}