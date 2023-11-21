package com.example.bottomnavigation.ui.mahasiswa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.FragmentNotificationsBinding


class StatusFragment : Fragment() {

    private lateinit var binding: FragmentNotificationsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentNotificationsBinding.inflate(inflater, container, false)

        requireActivity().apply {
            title = getString(R.string.title_status)
        }

        return binding.root
    }

    companion object {
        val TAG: String = StatusFragment::class.java.simpleName
        fun newInstance() = StatusFragment()
    }
}