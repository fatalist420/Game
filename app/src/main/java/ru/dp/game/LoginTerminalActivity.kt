package ru.dp.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_login_terminal.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class LoginTerminalActivity : AppCompatActivity() {




   //val userName:String = "DEMIURG"
   ////val userPassword:String = "54214155"
   //val userPassword:String = "1"
   //var userNameBoolean : Boolean = false
   //var userPasswordBoolean :Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_terminal)

        val inputText = filledTextField.editText?.text.toString()

        filledTextField.editText?.doOnTextChanged { text, start, before, count ->
            Toast.makeText(this,"$text",Toast.LENGTH_SHORT).show()
        }

            //val watcherUser = object : TextWatcher {
            // Respond to input text change//    override fun afterTextChanged(s: Editable?) {
        }//        val inputUserName = s.toString().toUpperCase(Locale.ROOT)
        //        //Toast.makeText(this@MainActivity, "after $inputUser", Toast.LENGTH_SHORT).show()
        //        userNameBoolean = if (inputUserName == userName) {
        //            println("User name is VALID")
        //            true
        //        } else false
        //        //if (userNameBoolean&&userPasswordBoolean) startActivity(Terminal)
        //    }
        //
        //    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        //        //Toast.makeText(this@MainActivity, "befor Chenged $s", Toast.LENGTH_SHORT).show()
        //    }
        //    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        //        //Toast.makeText(this@MainActivity, "on Chenged $s", Toast.LENGTH_SHORT).show()
        //    }
        //}
        //
        //val watcherPass = object : TextWatcher {
        //    override fun afterTextChanged(s: Editable?) {
        //        val inputUserPassword = s.toString().toUpperCase(Locale.ROOT)
        //        userPasswordBoolean = if (inputUserPassword == userPassword) {
        //            println("User pass is VALID")
        //            true
        //        } else false
        //        //if (userNameBoolean&&userPasswordBoolean) startActivity(Terminal)
        //        //Toast.makeText(this@MainActivity, "after Chenged $s", Toast.LENGTH_SHORT).show()
        //    }
        //
        //    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        //        //Toast.makeText(this@MainActivity, "befor Chenged $s", Toast.LENGTH_SHORT).show()
        //    }
        //
        //    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        //        //Toast.makeText(this@MainActivity, "on Chenged $s", Toast.LENGTH_SHORT).show()
        //    }
        //}
        //
        //iTUserName.addTextChangedListener(watcherUser)
        //iTUserPass.addTextChangedListener(watcherPass)

}

