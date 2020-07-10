package ru.dp.game

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //имя файла настроек
    private val APP_PREFERENCES : String = "GameSetting"
    private val KEY_APP_PREFERENCE_AUTH : String = "EMPTY"
    lateinit var pref: SharedPreferences

    companion object {
        const val MESSAGE:String="NULL"
    }

    private var resultMessage:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //проверить значение ключа APP_PREFERENCE_AUTH перед запуском утентификации
        pref = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
        if (!pref.contains(KEY_APP_PREFERENCE_AUTH)){
            val loginTerminal = Intent(this, LoginTerminalActivity::class.java)
            startActivityForResult(loginTerminal, 0)
        }

        val mailActivity = Intent(this@MainActivity, MailActivity::class.java)

        btn_mail.setOnClickListener{
            startActivityForResult(mailActivity, 1)
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            0 -> // LoginTerminalActivity
                //запись успешной аутентификации в ключ, чтобы не вызывать вход в терминал при каждой загрузке
                pref.edit().putString(KEY_APP_PREFERENCE_AUTH, "AUTH_OK").apply()
            1 -> // MailActivity
                Toast.makeText(this, "finish mail_activity", Toast.LENGTH_SHORT).show()
        }

    }
}

