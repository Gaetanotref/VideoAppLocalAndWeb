package com.apptest.videoapp

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.apptest.videoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //VIDEO FROM STORAGE
        val mediaController = MediaController(this)
        binding.videoview1.setVideoPath("android.resource://" + packageName + "/" + R.raw.mountains)

        mediaController.setAnchorView(binding.videoview1)
        mediaController.setMediaPlayer(binding.videoview1)
        binding.videoview1.setMediaController(mediaController)
        binding.videoview1.start()


        //VIDEO FROM WEB
        val uri =
            Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4")

        binding.videoview2.setVideoURI(uri)

        val mediaController2 = MediaController(this)

        mediaController2.setAnchorView(binding.videoview2)
        mediaController2.setMediaPlayer(binding.videoview2)
        binding.videoview2.setMediaController(mediaController2)
        binding.videoview2.start()


    }
}