package ru.dp.game

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val loginTerminal = Intent(this@MainActivity, LoginTerminalActivity::class.java)
        //startActivityForResult(loginTerminal, 1)

        btn_mail.setOnClickListener{
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        }
        
        btn_plus.setOnClickListener{
            Toast.makeText(this, "plus", Toast.LENGTH_SHORT).show()
        }
    }

    // Обработка двойного нажатия кнопки "BACK" для выхода из приложения
    private var backPress: Long = 0

    override fun onBackPressed() {
        if (backPress + 2000 > System.currentTimeMillis()) {
            super.onBackPressed()
        } else {
            backPress = System.currentTimeMillis()
            Toast.makeText(
                baseContext,
                " Для выхода нажмите кнопку Назад еще раз",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

