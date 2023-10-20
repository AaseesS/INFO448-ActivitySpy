package edu.uw.ischool.asingh28.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("Destroy App","onDestroy event fired")
        Log.e("Destroy App","We're going down, Captain! Jump off!")
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        Log.i("Start App","onStart event fired")
    }
    override fun onStop() {
        super.onStop()
        Log.i("Stop App","onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Pause App","onPause event fired")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Resume App", "onResume event fired")
    }
}