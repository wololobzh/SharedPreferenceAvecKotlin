package fr.acos.sharedpreferenceaveckotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickEcrire(view: View)
    {
        val objetSharedPreference = this?.getPreferences(Context.MODE_PRIVATE)

        val editeur = objetSharedPreference.edit()

        editeur.putString("mot","Hello")

        editeur.commit()
    }

    fun onClickLire(view: View)
    {
        val objetSharedPreference = this?.getPreferences(Context.MODE_PRIVATE)

        val recuperation = objetSharedPreference.getString("mot","Pas de valeur avec cette clé")

        Toast.makeText(this,recuperation,Toast.LENGTH_LONG).show()
    }
}
