package eu.tutorials.flags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import eu.tutorials.flags.adapter.MainAdapter
import eu.tutorials.flags.databinding.FragmentMainBinding
import eu.tutorials.flags.model.FlagViewModel

private const val ARG_PARAM1 = "user_name"

class MainFragment : Fragment() {

    private var userName: String? = null
    private var binding: FragmentMainBinding? = null
    private val sharedViewModel: FlagViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { userName = it.getString(ARG_PARAM1) }
    }

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
            mainViewModel = sharedViewModel
            recyclerView.adapter = MainAdapter(requireContext(), sharedViewModel.options.value!!)
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.setHasFixedSize(true)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun onSubmit() {
        if(!sharedViewModel.nextQuestion()) {
            move()
        }
    }

    private fun move() {
        val action = MainFragmentDirections.actionMainFragmentToResultsFragment(userName = userName!!)
        findNavController().navigate(action)
    }

}