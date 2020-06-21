package ru.dp.game

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_login_terminal.*
import java.util.*

class LoginTerminalActivity : AppCompatActivity() {

    private val userName:String = "DEMIURG"

    //val userPassword:String = "54214155"
    //val userPassword:String = "1"
    private var userNameBoolean : Boolean = false
    private var userPasswordBoolean :Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_terminal)

        outlinedTextField.editText?.doOnTextChanged { inputText, _, _, _ ->
            // Respond to input text change
            if (inputText.toString().toUpperCase(Locale.ROOT)==userName) {
                userNameBoolean=true

                Toast.makeText(this, "UserValid", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBackPressed() {

    }
}

