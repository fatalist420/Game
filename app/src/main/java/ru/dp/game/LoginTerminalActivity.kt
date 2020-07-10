package ru.dp.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
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
            if (userNameBoolean && userPasswordBoolean) terminalDialog()
        }

        outlinedTextFieldUserPassword.editText?.doOnTextChanged { inputText, _, _, _ ->
            // Respond to input text change
            // Set error text
            outlinedTextFieldUserPassword.error = getString(R.string.invalid_password)
            if (inputText.toString()==userPassword) {
                userPasswordBoolean=true
                // Clear error text
                outlinedTextFieldUserPassword.error = null
                // Set color box stroke
                outlinedTextFieldUserPassword.boxStrokeColor = getColor(R.color.colorTrue)
            }
            if (userNameBoolean && userPasswordBoolean) terminalDialog()
        }

        btn_help.setOnClickListener {
            // terminalDialog для подсказки
            MaterialAlertDialogBuilder(this)
                .setIcon(R.drawable.ic_baseline_help_outline_24)
                .setMessage(resources.getString(R.string.helper_text))
                .setPositiveButton(resources.getString(R.string.accept)) { _, _ ->
                    // Respond to positive button press
                }
                .show()
        }
    }

    override fun onBackPressed() {
        //Toast.makeText(this, "Введите имя пользователя и пароль", Toast.LENGTH_SHORT).show()
        Snackbar.make(inputUserPassword,"Введите имя пользователя и пароль",Snackbar.LENGTH_LONG)
            .setAction("Close"){

            }
            .show()
    }

    fun terminalDialog() {
        MaterialAlertDialogBuilder(this)
            .setMessage(resources.getString(R.string.supporting_text))
            .setPositiveButton(resources.getString(R.string.accept)) { _, _ ->
                // Respond to positive button press

                finish()
            }
            .show()
    }
}

