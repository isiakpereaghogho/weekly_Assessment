package com.example.weekfiveassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weekfiveassessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var myContactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val names : List<ContactModel> = listOf(
            ContactModel(
                "Aghogho", "Isiakpere"
            ),
            ContactModel(
                "Kelvin", "Adebayo"
            ),
            ContactModel(
                "Esiri", "Onos"
            ),
            ContactModel(
                "Seyi", "Tope"
            ),
            ContactModel(
                "Onyinye", "Okonkwo"
            ),
            ContactModel(
                "Tobore", "Okoro"
            ),
            ContactModel(
                "Ifeanyi", "Nwankwo"
            ),
            ContactModel(
                "Chukwuma", "Okocha"
            ),
            ContactModel(
                "Blessing", "Ajayi"
            ),
            ContactModel(
                "Seki", "Yusuf"
            ),
            ContactModel(
                "Emeka", "Chuks"
            ),
            ContactModel(
                "Akpevwe", "Akpor"
            ),
            ContactModel(
                "Great", "Efe"
            ),
            ContactModel(
                "John", "Sedi"
            ),
            ContactModel(
                "Esther", "Desmond"
            ),
            ContactModel(
                "Rita", "Jackson"
            ),
            ContactModel(
                "Oke", "Onome"
            ),
            ContactModel(
                "Efe", "Johnson"
            ),
            ContactModel(
                "peter", "Michael"
            ),
            ContactModel(
                "Emmanuel", "Smith"
            )
        )
        myContactAdapter = ContactAdapter(names)

        binding.recyclerView.adapter = myContactAdapter
    }
}