package com.omercankoc.firstapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SignalBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Signal received from other application!",Toast.LENGTH_LONG).show()
    }
}