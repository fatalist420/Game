package ru.dp.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_mail.*

val list = ArrayList<MailItem>()

class MailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mail)

        list.add(MailItem(
            R.drawable.ic_baseline_add_circle,
            "Добро пожаловать в подразделение Валькирия.",
            resources.getString(R.string.welcome_message))
        )

        rec_view.hasFixedSize()
        rec_view.layoutManager = LinearLayoutManager(this)

        rec_view.adapter = MailAdapter(list, this)
    }

    override fun onBackPressed() {
        finish()
    }
}