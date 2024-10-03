package com.example.animeku
/*
    User : Muflidevs
    day : 1

*/
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.animeku.databinding.ActivityMainBinding
import com.example.animeku.fragment.homeFragment
import com.example.animeku.fragment.profileFragment
import com.example.animeku.fragment.scheduleFragment
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(),View.OnClickListener{
    private lateinit var navigationBar : NavigationBarView
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager = supportFragmentManager
        val ProfileFragment = profileFragment()
        val HomeFragment = homeFragment()
        val ScheduleFragment = scheduleFragment()
        val fragment = fragmentManager.findFragmentByTag(profileFragment::class.java.simpleName)
        val fragmenthome  = fragmentManager.findFragmentByTag(homeFragment::class.java.simpleName)
        val fragmentSchedule = fragmentManager.findFragmentByTag(scheduleFragment::class.java.simpleName)
        navigationBar = binding.bottomNavigation

        navigationBar.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.profile -> {
                    if(fragment !is profileFragment) {
                        Log.d("MyFlexibleFragment", "Fragment Name : " + profileFragment::class.java.simpleName)
                        fragmentManager.beginTransaction().replace(binding.frameContainer.id,ProfileFragment,profileFragment::class.java.simpleName).commit()
                        true

                    } else {
                        finish()
                        false
                    }
                }
                R.id.home -> {
                    if(fragmenthome !is homeFragment) {
                        fragmentManager.beginTransaction().replace(binding.frameContainer.id,HomeFragment,homeFragment::class.java.simpleName).commit()
                        true
                    } else {
                        finish()
                        false
                    }
                }
                R.id.jadwal -> {
                    if(fragmentSchedule !is scheduleFragment) {
                        fragmentManager.beginTransaction().replace(binding.frameContainer.id,ScheduleFragment,scheduleFragment::class.java.simpleName).commit()
                        true
                    }
                    else {
                        finish()
                        false
                    }
                }
                else -> false

            }
        }


    }

    override fun onClick(p0: View?) {

    }

}