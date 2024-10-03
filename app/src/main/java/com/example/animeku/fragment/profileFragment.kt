package com.example.animeku.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.animeku.R
import com.example.animeku.User.UpdateActivity
import com.example.animeku.databinding.FragmentProfileBinding


class profileFragment : Fragment(),View.OnClickListener {

    private lateinit var binding : FragmentProfileBinding
    private lateinit var btnSetting : Button
    private lateinit var btnAbout : Button
    private lateinit var btnEditProfile : Button
    private lateinit var btnLogout : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnSetting = binding.settings
        btnEditProfile = binding.updateProfile
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClick(view: View?) {
//        when(view?.id) {
//            R.id.profile -> {
//                val intent = Intent(this@profileFragment, UpdateActivity::class.java)
//                startActivity(intent)
//            }
//        }
    }
}