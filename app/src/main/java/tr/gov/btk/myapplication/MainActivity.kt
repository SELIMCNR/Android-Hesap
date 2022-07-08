package tr.gov.btk.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sayi1: Double? = null
    var sayi2: Double? = null
    var sonuc: Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            Sonuc.text = "Sayi girmeyi unutmayınız"
        } else {
            sonuc = sayi1!! + sayi2!!
            Sonuc.text = "Sonuç : ${sonuc}"
        }

    }






    fun cikar(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            Sonuc.text = "Sayi girmeyi unutmayınız"
        } else {
            sonuc = sayi1!! - sayi2!!
            Sonuc.text = "Sonuç : ${sonuc}"
        }

    }




    fun bol(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            Sonuc.text = "Sayi girmeyi unutmayınız"
        } else {
            sonuc = sayi1!! / sayi2!!
            Sonuc.text = "Sonuç : ${sonuc}"
        }

    }




    fun carp(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            Sonuc.text = "Sayi girmeyi unutmayınız"
        } else {
            sonuc = sayi1!! * sayi2!!
            Sonuc.text = "Sonuç : ${sonuc}"
        }
    }


    fun yuzde(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            Sonuc.text = "Sayi girmeyi unutmayınız"
        } else {
            sonuc = (sayi1!! + sayi2!! )/ 100
            Sonuc.text = "Sonuç : ${sonuc}"
        }

    }

}