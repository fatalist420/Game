package ru.dp.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_login_terminal.*

class LoginTerminalActivity : AppCompatActivity() {
    /*
    val userName:String = "DEMIURG"
    //val userPassword:String = "54214155"
    val userPassword:String = "1"
    var userNameBoolean : Boolean = false
    var userPasswordBoolean :Boolean = false
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_terminal)

        // Get input text
        val inputText = outlinedTextField.editText?.text.toString()

        outlinedTextField.editText?.doOnTextChanged { inputText, start, _, _ ->
            // Respond to input text change
        }
    }
}

