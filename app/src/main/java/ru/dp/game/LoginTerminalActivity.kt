package ru.dp.game

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_login_terminal.*
import java.util.*

class LoginTerminalActivity : AppCompatActivity() {

    private val userName:String = "DEMIURG"

    private val userPassword:String = "54214155"

    private var userNameBoolean : Boolean = false
    private var userPasswordBoolean :Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_terminal)

        outlinedTextFieldUserName.editText?.doOnTextChanged { inputText, _, _, _ ->
            // Respond to input text change
            // Set error text
            outlinedTextFieldUserName.error = getString(R.string.invalid_username)
            if (inputText.toString().toUpperCase(Locale.ROOT)==userName) {
                userNameBoolean=true
                // Clear error text
                outlinedTextFieldUserName.error = null
                // Set color box stroke
                outlinedTextFieldUserName.boxStrokeColor = getColor(R.color.colorTrue)
            }
        }

        outlinedTextFieldUserPassword.editText?.doOnTextChanged { inputText, _, _, _ ->
            // Respond to input text change
            // Set error text
            outlinedTextFieldUserPassword.error = getString(R.string.invalid_password)
            if (inputText.toString().toUpperCase(Locale.ROOT)==userPassword) {
                userPasswordBoolean=true
                // Clear error text
                outlinedTextFieldUserPassword.error = null
                // Set color box stroke
                outlinedTextFieldUserPassword.boxStrokeColor = getColor(R.color.colorTrue)
            }
        }
        btn_help.setOnClickListener {
            val helpIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/id2552946"))
            startActivity(helpIntent)
        }
    }

    override fun onBackPressed() {
        Toast.makeText(this, "Введите имя пользователя и пароль", Toast.LENGTH_SHORT).show()
    }
}

