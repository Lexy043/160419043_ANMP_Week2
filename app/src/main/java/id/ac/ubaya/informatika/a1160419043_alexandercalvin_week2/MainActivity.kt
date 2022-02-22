    package id.ac.ubaya.informatika.a1160419043_alexandercalvin_week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.view.ActionMode
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

    class MainActivity : AppCompatActivity() {
        private lateinit var navController: NavController

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            navController = (supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment).navController
            NavigationUI.setupActionBarWithNavController(this, navController)
        }
        override fun onSupportNavigateUp(): Boolean {
            return navController.navigateUp()
        }

    }