package com.example.apollographqlrocketreserver

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.rocketreserver.LaunchListQuery

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        lifecycleScope.launchWhenResumed {
            val response = apolloClient.query(LaunchListQuery()).execute()

            Log.d("LaunchList", "Success ${response.data}")
        }
    }
}
