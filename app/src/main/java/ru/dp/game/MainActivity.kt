package ru.dp.game

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val userName:String = "KINTOHO"
    val userPassword:String = "A123"
    var userNameBoolean : Boolean = false
    var userPasswordBoolean :Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val watcherUser = object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                val inputUserName = s.toString().toUpperCase()
                //Toast.makeText(this@MainActivity, "after $inputUser", Toast.LENGTH_SHORT).show()
                userNameBoolean = if (inputUserName == userName) {
                    println("User name is VALID")
                    true
                } else false
                if (userNameBoolean&&userPasswordBoolean) println("Start New ACTIVITY")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //Toast.makeText(this@MainActivity, "befor Chenged $s", Toast.LENGTH_SHORT).show()
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //Toast.makeText(this@MainActivity, "on Chenged $s", Toast.LENGTH_SHORT).show()
            }
        }

        val watcherPass = object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                val inputUserPassword = s.toString().toUpperCase()
                userPasswordBoolean = if (inputUserPassword == userPassword) {
                    println("User pass is VALID")
                    true
                } else false
                if (userNameBoolean&&userPasswordBoolean) println("Start New ACTIVITY")
                //Toast.makeText(this@MainActivity, "after Chenged $s", Toast.LENGTH_SHORT).show()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //Toast.makeText(this@MainActivity, "befor Chenged $s", Toast.LENGTH_SHORT).show()
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //Toast.makeText(this@MainActivity, "on Chenged $s", Toast.LENGTH_SHORT).show()
            }
        }

        iTUserName.addTextChangedListener(watcherUser)
        iTUserPass.addTextChangedListener(watcherPass)
    }
}
