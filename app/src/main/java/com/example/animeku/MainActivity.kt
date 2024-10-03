package com.example.animeku
/*
    User : Muflidevs
    day : 1

*/
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.animeku.databinding.ActivityMainBinding
import com.example.animeku.fragment.profileFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager = supportFragmentManager
        val ProfileFragment = profileFragment()
        val fragment = fragmentManager.findFragmentByTag(profileFragment::class.java.simpleName)

        if(fragment !is profileFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name : " + profileFragment::class.java.simpleName)

            fragmentManager.beginTransaction().add(binding.frameContainer.id,ProfileFragment,profileFragment::class.java.simpleName)
        }
    }
}