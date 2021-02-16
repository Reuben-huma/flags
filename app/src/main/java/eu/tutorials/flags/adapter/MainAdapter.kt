package eu.tutorials.flags.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import eu.tutorials.flags.R

class MainAdapter(private val context: Context, private val dataSet: List<String>) : RecyclerView.Adapter<MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.button.text = dataSet[position]
    }

    override fun getItemCount() = dataSet.size
}

class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val button: Button = view.findViewById(R.id.material_button)
}