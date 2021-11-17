package com.example.fragmentwithdatapassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.fragmentwithdatapassing.fragment.FirstFragment
import com.example.fragmentwithdatapassing.fragment.SecondFragment
import com.example.fragmentwithdatapassing.fragment.ThirdFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

//    lateinit var currentFragment: Fragment
//    lateinit var drawerLayout: DrawerLayout
//    lateinit var navigationView: NavigationView
//    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        replaceFragment(FirstFragment(), null)

        val Firstfragment = FirstFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, Firstfragment).commit()

//        drawerLayout = findViewById(R.id.drawer_layout)
//        actionBarDrawerToggle= ActionBarDrawerToggle(this,drawerLayout, "Open","Close")
//        drawerLayout.addDrawerListener(actionBarDrawerToggle)
//        actionBarDrawerToggle.syncState()
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        navigationView = findViewById(R.id.navigationView)
//
//        navigationView.setNavigationItemSelectedListener { menuItem ->
//            when (menuItem.itemId){
//                R.id.nav_first->{
//                    replaceFragment(Firstfragment(),null)
//                }
//                R.id.nav_second ->{
//                    replaceFragment(SecondFragment(),null)
//                }
//            }
//
//
//        }




    }

//    private fun replaceFragment(setFragment: Fragment, bundle: Bundle?) {
//        currentFragment = setFragment
//        val fragmentManager = supportFragmentManager
//        if (bundle != null) {
//            setFragment.arguments = bundle
//        }
//        val fragmentTra = fragmentManager.beginTransaction().addToBackStack(null)
//        fragmentTra.replace(R.id.fragment_container, setFragment)
//        fragmentTra.commit()
//
//    }

}

