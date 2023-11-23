package com.example.bottomnavigation.ui.mahasiswa

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.bottomnavigation.R
import com.example.bottomnavigation.activity.mahasiswa.EjurnalActivity
import com.example.bottomnavigation.activity.mahasiswa.KalenderActivity
import com.example.bottomnavigation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        requireActivity().apply {
            title = getString(R.string.title_home)
        }

        binding.imageButton5.setOnClickListener {
            navigateToEjurnalActivity()
        }
        binding.imageButton4.setOnClickListener {
            navigateToKalenderActivity()
        }

        return binding.root
    }

    private fun navigateToEjurnalActivity() {
        val intent = Intent(requireContext(), EjurnalActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToKalenderActivity() {
        val intent = Intent(requireContext(), KalenderActivity::class.java)
        startActivity(intent)
    }

    companion object {
        val TAG: String = HomeFragment::class.java.simpleName
        fun newInstance() = HomeFragment()
    }
}