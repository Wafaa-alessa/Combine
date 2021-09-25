package com.example.combine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","Hello Everyone")
        var num1=7
        var num2=3
        var r1:Int
        var r2:Int
        var r3:Int
        var r4:Int
        var r5:Int
        r1 = num1 + num2
        r2 = num1 - num2
        r3 = num1 * num2
        r4 = num1 / num2
        r5 = num1 % num2
        Log.d("MainActivity", "${r1}" )
        Log.d("MainActivity", "${r2}" )
        Log.d("MainActivity", "${r3}" )
        Log.d("MainActivity", "${r4}" )
        Log.d("MainActivity", "${r5}" )

        var x=13
        var y=10
        if(x>y){
            Log.d("MainActivity","x>y")
        }
        else{
            Log.d("MainActivity","x<y")

        }
    }
}