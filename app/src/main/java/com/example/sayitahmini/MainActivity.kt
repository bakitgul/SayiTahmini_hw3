package com.example.sayitahmini

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.Random
import com.example.sayitahmini.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var rastgeleSayi = 0
        var sayac = 3
        var skor = 100

        rastgeleSayi = (1..100).random()
        Log.e("Rastgele Sayı : ", rastgeleSayi.toString())

        binding.buttonTahminEt.setOnClickListener {
            sayac = sayac-1
            skor = skor -1

            val tahmin = binding.textTahminSayi.text.toString().toInt()

            if(tahmin == rastgeleSayi){
                binding.textBilgi.text = "Tebrikler Bildiniz Skorunuz : $skor"
                binding.textSonuc.text = "-"
                //binging.buttonTahmin.setEnabled(false)

            }

            if(tahmin > rastgeleSayi){
                binding.textBilgi.text = "Daha Küçük Bir Sayı Dene"
                binding.textSonuc.text = "Skorunuz : $skor"


            }

            if(tahmin < rastgeleSayi){
                binding.textBilgi.text = "Daha Büyük Bir Sayı Dene"
                binding.textSonuc.text = "Skorunuz : $skor"


            }

            if(sayac == 0){
                binding.textSonuc.text = "Tahimin Hakkınız Bitti"
                // binding.buttonTahmin.setEnabled(false)


            }
        }
    }
}