package com.gellertbiro.birthdaychallenge.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gellertbiro.birthdaychallenge.R

class BirthdayListAdapter(private val listener: (id: String) -> Unit) : RecyclerView.Adapter<BirthdayListAdapter.ViewHolder>() {

    private var list: List<BirthDayListItem> = listOf()

    fun submitList(list: List<BirthDayListItem>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.birthday_list_item, parent, false)
        return ViewHolder(view, listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    class ViewHolder(view: View, private val listener: (id: String) -> Unit) : RecyclerView.ViewHolder(view) {

        init {
            view.setOnClickListener {
                listener.invoke(itemView.findViewById<TextView>(R.id.name).text.toString())
            }
        }

        fun bind(item: BirthDayListItem) {
            itemView.findViewById<TextView>(R.id.initials).text = item.initials
            itemView.findViewById<TextView>(R.id.name).text = item.name
            itemView.findViewById<TextView>(R.id.date).text = item.date
        }
    }
}