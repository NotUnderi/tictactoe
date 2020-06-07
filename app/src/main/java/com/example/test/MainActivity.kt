package com.example.test

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.schedule
import android.os.Handler
import android.widget.Button
import android.view.*

class MainActivity : AppCompatActivity() {
    val TAG = "MyActivity"

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button2 = findViewById<ImageButton>(R.id.imageButton2)
        var button3 = findViewById<ImageButton>(R.id.imageButton3)
        var button4 = findViewById<ImageButton>(R.id.imageButton4)
        var button5 = findViewById<ImageButton>(R.id.imageButton5)
        var button6 = findViewById<ImageButton>(R.id.imageButton6)
        var button7 = findViewById<ImageButton>(R.id.imageButton7)
        var button8 = findViewById<ImageButton>(R.id.imageButton8)
        var button9 = findViewById<ImageButton>(R.id.imageButton9)
        var button10 = findViewById<ImageButton>(R.id.imageButton10)
        var start = findViewById<Button>(R.id.start)

        var teksti = findViewById<TextView>(R.id.textView3)
        var txt = "Aika PPAP moment";
        main(
            button2,
            button3,
            button4,
            button5,
            button6,
            button7,
            button8,
            button9,
            button10,
            start,
            teksti,
            txt
        );
    }

    //var button4 = findViewById<Button>(R.id.button4)
    fun delayFunction(function: () -> Unit, delay: Long) {
        Handler().postDelayed(function, delay)
    }

    fun main(
        button2: ImageButton,
        button3: ImageButton,
        button4: ImageButton,
        button5: ImageButton,
        button6: ImageButton,
        button7: ImageButton,
        button8: ImageButton,
        button9: ImageButton,
        button10: ImageButton,
        start: Button,
        teksti: TextView,
        txt: String
    ) {
        val status = arrayOf(0, 0, 0, 0, 0 ,0 ,0 ,0 ,0)

        start.setOnClickListener {
            start.visibility = View.GONE
            button2.visibility = View.VISIBLE
            button3.visibility = View.VISIBLE
            button4.visibility = View.VISIBLE
            button5.visibility = View.VISIBLE
            button6.visibility = View.VISIBLE
            button7.visibility = View.VISIBLE
            button8.visibility = View.VISIBLE
            button9.visibility = View.VISIBLE
            button10.visibility = View.VISIBLE
            Handler().postDelayed({}, 500)

            //game(button2,button3,button4,button5,button6,button7,button8,button9,button10)


        }


        var player = 0;
        button2.setOnClickListener() {
            if (player == 0) {
                button2.setImageResource(R.drawable.x);player = 1;status[0] = 1
            } else if (player == 1) {
                button2.setImageResource(R.drawable.o);player = 0;status[0] = 2
            }
            check(status)
        }
        button3.setOnClickListener() {
            if (player == 0) {
                button3.setImageResource(R.drawable.x);player = 1;status[1] = 1
            } else if (player == 1) {
                button3.setImageResource(R.drawable.o);player = 0;status[1] = 2
            }
            check(status)
        }
        button4.setOnClickListener() {
            if (player == 0) {
                button4.setImageResource(R.drawable.x);player = 1;status[2] = 1
            } else if (player == 1) {
                button4.setImageResource(R.drawable.o);player = 0;status[2] = 2
            }
            check(status)
        }
        button5.setOnClickListener() {
            if (player == 0) {
                button5.setImageResource(R.drawable.x);player = 1;status[3] = 1
            } else if (player == 1) {
                button5.setImageResource(R.drawable.o);player = 0;status[3] = 2
            }
            check(status)
        }
        button6.setOnClickListener() {
            if (player == 0) {
                button6.setImageResource(R.drawable.x);player = 1;status[4] = 1
            } else if (player == 1) {
                button6.setImageResource(R.drawable.o);player = 0;status[4] = 2
            }
            check(status)
        }
        button7.setOnClickListener() {
            if (player == 0) {
                button7.setImageResource(R.drawable.x);player = 1;status[5] = 1
            } else if (player == 1) {
                button7.setImageResource(R.drawable.o);player = 0;status[5] = 2
            }
            check(status)
        }
        button8.setOnClickListener() {
            if (player == 0) {
                button8.setImageResource(R.drawable.x);player = 1;status[6] = 1
            } else if (player == 1) {
                button8.setImageResource(R.drawable.o);player = 0;status[6] = 2
            }
            check(status)
        }
        button9.setOnClickListener() {
            if (player == 0) {
                button9.setImageResource(R.drawable.x);player = 1;status[7] = 1
            } else if (player == 1) {
                button9.setImageResource(R.drawable.o);player = 0;status[7] = 2
            }
            check(status)

        }
        button10.setOnClickListener() {
            if (player == 0) {
                button10.setImageResource(R.drawable.x);player = 1;status[8] = 1
            } else if (player == 1) {
                button10.setImageResource(R.drawable.o);player = 0;status[8] = 2
            }
            check(status)
        }

        /*
        var i = 0
        button2.setOnClickListener {
            //fishcalc(255,100);
            teksti.setText(txt)
        }
        button3.setOnClickListener{
            teksti.setText(" ")
        }
        button6.setOnClickListener{

            Log.i(TAG,"Button 6 pressed")
            Log.i(TAG,"$i")
            if (i == 0) {
                button6.setImageResource(R.drawable.x)
                i = 1
            }
            else if ( i == 1){
                button6.setImageResource(R.drawable.empty)
                var resource = R.drawable.empty
                Log.i(TAG,"Should go to empty, res id is $resource")
                i = 0
            }*/
    }

    private fun fishcalc(fish: Int, food: Int): Double {

        Log.i(TAG, "Bruh")
        var newfish = food * 0.5
        var totalfish = newfish + fish
        Log.i(TAG, "$totalfish")
        return totalfish
    }
}

  fun check(status: Array<Int>){
    if(status[0] == 1 && status[1] == 1 && status[2] == 1 || status[0] == 1 && status[3] == 1 && status[6] == 1 ||status[1] == 1 && status[4] == 1 && status[7] == 1 || status[2] == 1 && status[5] == 1 && status[8] == 1 || status[3] == 1 && status[4] == 1 && status[5] == 1 || status[6] == 1 && status[7] == 1 && status[8] == 1){
        win1()
    }
 }

 fun win1(){
        Log.i("Voitto","Voitit pelin")
}

 fun win2(){

}