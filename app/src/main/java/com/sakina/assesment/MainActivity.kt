package com.sakina.assesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilnum1 : TextInputLayout
    lateinit var etnum1 : TextInputEditText
    lateinit var tilnum2 : TextInputLayout
    lateinit var etnum2 : TextInputEditText
    lateinit var btnadd : Button
    lateinit var btnsubtract : Button
    lateinit var btnmodulus : Button
    lateinit var btndivision : Button
    lateinit var btncalculate : Button
    lateinit var tvresults : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
    }
    fun castView(){
        tilnum1=findViewById(R.id.tilnum1)
        tilnum2=findViewById(R.id.tilnum2)
        etnum1=findViewById(R.id.etnum1)
        etnum2=findViewById(R.id.etnum2)
        btnadd=findViewById(R.id.btnadd)
        btnsubtract=findViewById(R.id.btnsubtract)
        btnmodulus=findViewById(R.id.btnmodulus)
        btndivision=findViewById(R.id.btndivision)
        btncalculate=findViewById(R.id.btncalculate)
        tvresults=findViewById(R.id.tvresults)


        btnadd.setOnClickListener {
            var num1 =etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            add(num1,num2)

        }
        btnsubtract.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            subtract(num1,num2)
        }
        btnmodulus.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            modulus(num1,num2)
        }
        btndivision.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            division(num1,num2)
        }
        btncalculate.setOnClickListener {
            validate()
        }
    }

    fun validate(){
        tilnum1.error=null
        tilnum2.error=null
        var error=false
        var num1 = etnum1.text.toString()
        if (num1.isBlank()){
            tilnum1.error="Number is required"
            error=true
        }
        var num2 = etnum2.text.toString()
        if (num2.isBlank()){
            tilnum2.error="Second number is required"
            error=true
        }
        if (!error){

        }
    }


    fun add(num1:Int,num2:Int){
        var number = num1+num2
        tvresults.text=number.toString()
    }
    fun subtract(num1: Int,num2: Int){
        var number =num1-num2
        tvresults.text=number.toString()
    }
    fun modulus(num1: Int,num2: Int){
        var number = num1%num2
        tvresults.text=number.toString()
    }
    fun division(num1: Int,num2: Int){
        var number = num1/num2
        tvresults.text=number.toString()
    }
}