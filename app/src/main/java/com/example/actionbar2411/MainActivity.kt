package com.example.actionbar2411

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.button)
        var text:TextView=findViewById(R.id.textView)
        var actionBar: ActionBar = supportActionBar!!
        actionBar.title = "This is new Action Bar"
        actionBar.subtitle = "created by Ani"
        actionBar.setIcon(R.drawable.ic_action_name)
        actionBar.setDisplayUseLogoEnabled(true)
        registerForContextMenu(text)
        btn.setOnClickListener{
            var popUp  = PopupMenu(this,btn)
            popUp.menuInflater.inflate(R.menu.option_menu,popUp.menu)
            popUp.setOnMenuItemClickListener {
                Toast.makeText(this,"You clicked",Toast.LENGTH_SHORT).show()
                true
            }
            popUp.show()
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)


        return true
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.option_menu,menu)

    }



}