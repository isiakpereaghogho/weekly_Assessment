package com.example.weekfiveassessment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weekfiveassessment.databinding.ContactItemBinding
import com.example.weekfiveassessment.databinding.ActivityMainBinding


class ContactAdapter (val names: List<ContactModel>):RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(val binding: ContactItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(names: ContactModel){
            binding.firstName.text = names.firstName
            binding.lastName.text = names.lastName
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding : ContactItemBinding = ContactItemBinding.inflate(LayoutInflater.from(parent.context))
            return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val names = names.get(position)
        holder.bind(names)
    }

    override fun getItemCount(): Int{
        return names.size
    }
}