package com.example.navigationdrawer.ui.Informacion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigationdrawer.databinding.FragmentInfoBinding
import com.example.navigationdrawer.recycler.Adapter.InformacionAdapter
import com.example.navigationdrawer.recycler.InformacionProvider

class InformacionFragment : Fragment() {
    private var _binding: FragmentInfoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInfoBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = InformacionAdapter(InformacionProvider.info)
        }
    }
}