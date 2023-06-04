package com.example.newkotlin

import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var videoView2: VideoView
    private lateinit var videoView3: VideoView

    private val videoUrl =
        "https://edisciplinas.usp.br/pluginfile.php/5196097/mod_resource/content/1/Teste.mp4"
    private val videoUrl2 = "https://getsamplefiles.com/download/mp4/sample-2.mp4"
    private val videoUrl3 =
        "https://freetestdata.com/wp-content/uploads/2022/02/Free_Test_Data_15MB_MP4.mp4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView = findViewById(R.id.videoView1)
        videoView2 = findViewById(R.id.videoView2)
        videoView3 = findViewById(R.id.videoView3)

        val videoUri = Uri.parse(videoUrl)
        videoView.setVideoURI(videoUri)
        videoView.setOnCompletionListener { mp ->
            mp.start()
        }
        videoView.start()

        val videoUri2 = Uri.parse(videoUrl2)
        videoView2.setVideoURI(videoUri2)
        videoView2.setOnCompletionListener { mp ->
            mp.start()
        }
        videoView2.start()

        val videoUri3 = Uri.parse(videoUrl3)
        videoView3.setVideoURI(videoUri3)
        videoView3.setOnCompletionListener { mp ->
            mp.start()
        }
        videoView3.start()
    }
}


