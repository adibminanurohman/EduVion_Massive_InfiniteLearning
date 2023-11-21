package com.example.bottomnavigation.ui.mahasiswa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.FragmentDashboardBinding


class KonsultasiFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentDashboardBinding.inflate(inflater, container, false)

        requireActivity().apply {
            title = getString(R.string.title_konsultasi)
        }

        return binding.root
    }

    companion object {
        val TAG: String = KonsultasiFragment::class.java.simpleName
        fun newInstance() = KonsultasiFragment()
    }
}