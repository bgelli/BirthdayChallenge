package com.gellertbiro.birthdaychallenge.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gellertbiro.birthdaychallenge.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailFragment : Fragment() {

    companion object {
        const val KEY_ID = "key_id"
    }

    private val viewModel: DetailViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.detail_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        view.findViewById<Button>(R.id.return_button)?.setOnClickListener {
            findNavController().popBackStack()
        }

        viewModel.birthDay.observe(viewLifecycleOwner, {
            view.findViewById<TextView>(R.id.initials).text = it.initials
            view.findViewById<TextView>(R.id.name).text = it.name
            view.findViewById<TextView>(R.id.age).text = getString(R.string.age_text, it.age)
        })

        arguments?.getString(KEY_ID)?.let {
            viewModel.loadData(it)
        }
    }
}