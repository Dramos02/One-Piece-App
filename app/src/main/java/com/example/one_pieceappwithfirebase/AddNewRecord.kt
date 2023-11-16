package com.example.one_pieceappwithfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.one_pieceappwithfirebase.databinding.ActivityAddNewRecordBinding

class AddNewRecord : AppCompatActivity() {
    private lateinit var binding: ActivityAddNewRecordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNewRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIdSave.setOnClickListener {
            var name_is = binding.txtIdName.text.toString()
            var bounty_is = binding.txtIdBounty.text.toString()
            var power_is = binding.txtIdPower.text.toString()
            var image_is = binding.txtIdImgurl.text.toString()

            if (name_is.isEmpty()){
                f_validate_msg("name")
            } else if (bounty_is.isEmpty()){
                f_validate_msg("bounty")
            } else if (power_is.isEmpty()){
                f_validate_msg("power")
            } else if (image_is.isEmpty()){
                f_validate_msg("picture")
            }
        }

        binding.btnIdCancel.setOnClickListener{
            finish()
        }
    }
    private fun f_validate_msg(info:String){
        Toast.makeText(applicationContext, "Please enter character " + info,Toast.LENGTH_SHORT).show()
    }
}

