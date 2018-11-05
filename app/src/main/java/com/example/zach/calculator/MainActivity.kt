package com.example.zach.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {


    var val1:Double= Double.NaN
    var val2:Double=Double.NaN

    val ADDITION = '+'
    val SOUSTRACTION = '-'
    val MULTIPLICATION ='*'
    val DIVISION = '/'
    var EQU:Char?=null

    var ACTION:Char?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_0.setOnClickListener { info_tv.setText(info_tv.text.toString() + "0") }
        b_1.setOnClickListener { info_tv.setText(info_tv.text.toString() + "1") }
        b_2.setOnClickListener { info_tv.setText(info_tv.text.toString() + "2") }
        b_3.setOnClickListener { info_tv.setText(info_tv.text.toString() + "3") }
        b_4.setOnClickListener { info_tv.setText(info_tv.text.toString() + "4") }
        b_5.setOnClickListener { info_tv.setText(info_tv.text.toString() + "5")}
        b_6.setOnClickListener {info_tv.setText(info_tv.text.toString() + "6") }
        b_7.setOnClickListener { info_tv.setText(info_tv.text.toString() + "7") }
        b_8.setOnClickListener { info_tv.setText(info_tv.text.toString() + "8") }
        b_9.setOnClickListener { info_tv.setText(info_tv.text.toString() + "9") }


        plus.setOnClickListener {
            calcul()
            ACTION = ADDITION
            result_tv.setText(val1.toString() + "+")
            info_tv.setText(null)

        }

        minus.setOnClickListener {
            calcul()
            ACTION = SOUSTRACTION;
            result_tv.setText(val1.toString() + "-")
            info_tv.setText(null)
        }
        multiply.setOnClickListener {
            calcul()
            ACTION = MULTIPLICATION;
            result_tv.setText(val1.toString() + "*")
            info_tv.setText(null)
        }
        divide.setOnClickListener {
            calcul()
            ACTION = DIVISION;
            result_tv.setText(val1.toString() + "/")
            info_tv.setText(null)
        }

        equals.setOnClickListener {
            calcul()
            ACTION = EQU;
            result_tv.setText(val1.toString());
            // 5 + 4 = 9
            info_tv.setText(null);
        }
        reset.setOnClickListener {
            if (info_tv.text.length > 0) {
                val name = info_tv.text
                info_tv.setText(name.subSequence(0, name.length - 1))
            } else {
                val1 = java.lang.Double.NaN
                val2 = java.lang.Double.NaN
                info_tv.setText(null)
                result_tv.setText(null)
            }
        }
    }

    fun calcul(){
        if (!java.lang.Double.isNaN(val1)) {
            val2 = info_tv.getText().toString().toDouble()

            when (ACTION) {
                ADDITION -> val1 =val1.plus(val2)
                SOUSTRACTION -> val1 = val1.minus(val2)
                MULTIPLICATION -> val1 = val1.times(val2)
                DIVISION -> val1 = val1.div(val2)
                EQU -> {
                }
            }
        } else {
            val1 = info_tv.getText().toString().toDouble()
        }
    }


}
