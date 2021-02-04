package com.gellertbiro.birthdaychallenge.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gellertbiro.birthdaychallenge.R
import com.gellertbiro.birthdaychallenge.ui.detail.DetailFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = BirthdayListAdapter {
            navigateToDetail(it)
        }

        view.findViewById<RecyclerView>(R.id.list)?.let {
            it.adapter = adapter
            it.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            it.addItemDecoration(DividerItemDecoration(it.context, LinearLayoutManager.VERTICAL))
        }

        val observer = Observer<List<BirthDayListItem>> { newList ->
            adapter.submitList(newList)
        }
        viewModel.list.observe(viewLifecycleOwner, observer)

        viewModel.loadData()
    }

    private fun navigateToDetail(id: String) {
        val bundle = Bundle().apply {
            putString(DetailFragment.KEY_ID, id)
        }

        findNavController().navigate(R.id.detailFragment, bundle)
    }

}