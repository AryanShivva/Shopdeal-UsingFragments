package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.SearchView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        replaceWithFragment(home())                                                 //calling function

        val bottomView = findViewById<BottomNavigationView>(R.id.bottomnavigation) //finding

        bottomView.setOnItemSelectedListener{                             //using
            when(it.itemId){
                R.id.item1 -> replaceWithFragment(home())                             //replace with the fragments when clicke on it
                R.id.item2 -> replaceWithFragment(category())
                R.id.item3 -> replaceWithFragment(search())
                R.id.item4 -> replaceWithFragment(cart())
                R.id.item5 -> replaceWithFragment(profile())
                else -> {
                }
            }
            true       // making items clickable

        }



    }

    private fun replaceWithFragment(fragment : Fragment){                       //function name and accepting the fragment

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()            //by default it will show home fragment
        fragmentTransaction.replace(R.id.framelayout,fragment)
        fragmentTransaction.commit()
    }




    }
