package eu.tutorials.flags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import eu.tutorials.flags.databinding.FragmentLoginBinding
import eu.tutorials.flags.model.FlagViewModel

class LoginFragment : Fragment() {

    private var binding: FragmentLoginBinding? = null
    private val viewModel: FlagViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            loginFragment = this@LoginFragment
            loginViewModel = viewModel
        }
    }

    fun onStartPressed() {
        findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
    }

}