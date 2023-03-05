package com.example.apollographqlrocketreserver

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.apollographqlrocketreserver.databinding.ActivityMainBinding
import com.example.rocketreserver.LaunchListQuery

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

/*        lifecycleScope.launchWhenResumed {
            val response = apolloClient(c).query(LaunchListQuery()).execute()

            Log.d("LaunchList", "Success ${response.data}")
        }*/
    }
}
