package eu.tutorials.flags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import eu.tutorials.flags.adapter.MainAdapter
import eu.tutorials.flags.databinding.FragmentMainBinding
import eu.tutorials.flags.model.FlagViewModel

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null
    private val viewModel: FlagViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            mainFragment = this@MainFragment
            mainViewModel = viewModel
            recyclerView.adapter = MainAdapter(requireContext(), viewModel.options.value!!)
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.setHasFixedSize(true)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun onSubmit() {
        viewModel.nextQuestion()
    }

}