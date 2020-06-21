package ru.dp.game

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val LoginTerminal = Intent(this@MainActivity, LoginTerminalActivity::class.java)
        startActivityForResult(LoginTerminal, 1)
    }

    // Обработка двойного нажатия кнопки "BACK" для выхода из приложения
    private var back_press: Long = 0

    override fun onBackPressed() {
        if (back_press + 1000 > System.currentTimeMillis()) {
            super.onBackPressed()
        } else {
            back_press = System.currentTimeMillis()
            Toast.makeText(
                baseContext,
                " Для выхода нажмите кнопку Назад еще раз",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

