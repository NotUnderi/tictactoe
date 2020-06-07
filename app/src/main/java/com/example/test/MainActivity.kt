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
import java.util.*

class MainActivity : AppCompatActivity() {

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
        var restart = findViewById<Button>(R.id.restart)

        var winText = findViewById<TextView>(R.id.voitto)
        var winText2 = findViewById<TextView>(R.id.voitto2)
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
            restart,
            winText,
            winText2
        );
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
        restart: Button,
        winText: TextView,
        winText2: TextView
    ) {
        var status = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
        var player = 0;
        var over = 0
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
        }

        restart.setOnClickListener() {
            restart.visibility = View.GONE
            status[0] = 0
            status[1] = 0
            status[2] = 0
            status[3] = 0
            status[4] = 0
            status[5] = 0
            status[6] = 0
            status[7] = 0
            status[8] = 0

            button2.setImageResource(R.drawable.empty)
            button3.setImageResource(R.drawable.empty)
            button4.setImageResource(R.drawable.empty)
            button5.setImageResource(R.drawable.empty)
            button6.setImageResource(R.drawable.empty)
            button7.setImageResource(R.drawable.empty)
            button8.setImageResource(R.drawable.empty)
            button9.setImageResource(R.drawable.empty)
            button10.setImageResource(R.drawable.empty)

            winText.text = ""
            winText2.text = ""

            player = 0
            over = 0
        }

        button2.setOnClickListener() {
            if (status[0] == 0 && over == 0 && restart.getVisibility() == View.GONE) {
                if (player == 0) {
                    button2.setImageResource(R.drawable.x);player = 1;status[0] = 1
                } else if (player == 1) {
                    button2.setImageResource(R.drawable.o);player = 0;status[0] = 2
                }
            }
            check(status, winText, winText2, restart)
        }
        button3.setOnClickListener() {
            if (status[1] == 0 && over == 0 && restart.getVisibility() == View.GONE) {
                if (player == 0) {
                    button3.setImageResource(R.drawable.x);player = 1;status[1] = 1
                } else if (player == 1) {
                    button3.setImageResource(R.drawable.o);player = 0;status[1] = 2
                }
            }
            check(status, winText, winText2, restart)
        }
        button4.setOnClickListener() {
            if (status[2] == 0 && over == 0 && restart.getVisibility() == View.GONE) {
                if (player == 0) {
                    button4.setImageResource(R.drawable.x);player = 1;status[2] = 1
                } else if (player == 1) {
                    button4.setImageResource(R.drawable.o);player = 0;status[2] = 2
                }
            }
            check(status, winText, winText2, restart)
        }
        button5.setOnClickListener() {
            if (status[3] == 0 && over == 0 && restart.getVisibility() == View.GONE) {
                if (player == 0) {
                    button5.setImageResource(R.drawable.x);player = 1;status[3] = 1
                } else if (player == 1) {
                    button5.setImageResource(R.drawable.o);player = 0;status[3] = 2
                }
            }
            check(status, winText, winText2, restart)
        }
        button6.setOnClickListener() {
            if (status[4] == 0 && over == 0 && restart.getVisibility() == View.GONE) {
                if (player == 0) {
                    button6.setImageResource(R.drawable.x);player = 1;status[4] = 1
                } else if (player == 1) {
                    button6.setImageResource(R.drawable.o);player = 0;status[4] = 2
                }
            }
            check(status, winText, winText2, restart)
        }
        button7.setOnClickListener() {
            if (status[5] == 0 && over == 0 && restart.getVisibility() == View.GONE) {
                if (player == 0) {
                    button7.setImageResource(R.drawable.x);player = 1;status[5] = 1
                } else if (player == 1) {
                    button7.setImageResource(R.drawable.o);player = 0;status[5] = 2
                }
            }
            check(status, winText, winText2, restart)
        }
        button8.setOnClickListener() {
            if (status[6] == 0 && over == 0 && restart.getVisibility() == View.GONE) {
                if (player == 0) {
                    button8.setImageResource(R.drawable.x);player = 1;status[6] = 1
                } else if (player == 1) {
                    button8.setImageResource(R.drawable.o);player = 0;status[6] = 2
                }
            }
            check(status, winText, winText2, restart)
        }
        button9.setOnClickListener() {
            if (status[7] == 0 && over == 0 && restart.getVisibility() == View.GONE) {
                if (player == 0) {
                    button9.setImageResource(R.drawable.x);player = 1;status[7] = 1
                } else if (player == 1) {
                    button9.setImageResource(R.drawable.o);player = 0;status[7] = 2
                }
            }
            check(status, winText, winText2, restart)
        }
        button10.setOnClickListener() {
            if (status[8] == 0 && over == 0 && restart.getVisibility() == View.GONE) {
                if (player == 0) {
                    button10.setImageResource(R.drawable.x);player = 1;status[8] = 1
                } else if (player == 1) {
                    button10.setImageResource(R.drawable.o);player = 0;status[8] = 2
                }
            }
            check(status, winText, winText2, restart)

        }
    }
}


fun check(status: Array<Int>, winText: TextView, winText2: TextView, restart: Button) {
    Log.i("Status", Arrays.toString(status))
    if (status[0] == 1 && status[1] == 1 && status[2] == 1 || status[0] == 1 && status[3] == 1 && status[6] == 1 || status[1] == 1 && status[4] == 1 && status[7] == 1 || status[2] == 1 && status[5] == 1 && status[8] == 1 || status[3] == 1 && status[4] == 1 && status[5] == 1 || status[6] == 1 && status[7] == 1 && status[8] == 1) {
        win1(winText, winText2, restart)
    } else if (status[0] == 2 && status[1] == 2 && status[2] == 2 || status[0] == 2 && status[3] == 2 && status[6] == 2 || status[1] == 2 && status[4] == 2 && status[7] == 2 || status[2] == 2 && status[5] == 2 && status[8] == 2 || status[3] == 2 && status[4] == 2 && status[5] == 2 || status[6] == 2 && status[7] == 2 && status[8] == 2) {
        win2(winText, winText2, restart)
    } else if (status[0] != 0 && status[1] != 0 && status[2] != 0 && status[3] != 0 && status[4] != 0 && status[5] != 0 && status[6] != 0 && status[7] != 0 && status[8] != 0) {
        tie(winText, winText2, restart)
    }
}

fun win1(winText: TextView, winText2: TextView, restart: Button) {
    Log.i("Voitto", "Voitit pelin")
    winText.setText("X voittaa")
    winText2.setText("X voittaa")
    restart.visibility = View.VISIBLE

}

fun win2(winText: TextView, winText2: TextView, restart: Button) {
    Log.i("Voitto", "Voitit pelin")
    winText.text = "O voittaa"
    winText2.text = "O voittaa"
    restart.visibility = View.VISIBLE
}

fun tie(winText: TextView, winText2: TextView, restart: Button) {
    Log.i("Voitto", "Voitit pelin")
    winText.text = "Tasapeli"
    winText2.text = "Tasapeli"
    restart.visibility = View.VISIBLE
}