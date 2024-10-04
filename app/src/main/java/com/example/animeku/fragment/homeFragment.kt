package com.example.animeku.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.animeku.R
import com.example.animeku.databinding.FragmentHomeBinding


class homeFragment : Fragment(), View.OnClickListener {
    private lateinit var binding : FragmentHomeBinding
    private lateinit var tvCategoryName : TextView
    private lateinit var tvCategoryDescription : TextView
    private lateinit var btnShowDialog : Button
    var description : String? = null

    companion object {
        val EXTRA_NAME = "extra_name"
        val EXTRA_DESCRIPTION = "extra_description"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvCategoryName = binding.tvCategoryName
        tvCategoryDescription = binding.tvCategoryDescription
        btnShowDialog = binding.btnShowDialog

        super.onViewCreated(view, savedInstanceState)

        if(savedInstanceState != null) {
            val descFromBundle = savedInstanceState.getString(EXTRA_DESCRIPTION)
            description = descFromBundle
        }

        if(arguments != null ) {
            val categoryName = arguments?.getString(EXTRA_NAME)
            tvCategoryName.text = categoryName
            tvCategoryDescription.text = description
        }

        btnShowDialog.setOnClickListener {
            val detailCategoryFragment = homeFragment()
            val bundle = Bundle()
            bundle.putString(homeFragment.EXTRA_NAME, "lifeStyle")
            val description = "kategori ini akan berisi anime anime"

            detailCategoryFragment.arguments = bundle
            detailCategoryFragment.description = description

         }

    }
    override fun onClick(view: View?) {


    }

}