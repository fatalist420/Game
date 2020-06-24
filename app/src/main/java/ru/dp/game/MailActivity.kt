package ru.dp.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_mail.*

class MailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mail)

        val list = ArrayList<ItemList>()
        list.add(ItemList(R.drawable.ic_baseline_add_circle, "Title", "Text 1"))
        list.add(ItemList(R.drawable.ic_baseline_help_outline_24, "Title", "Text 2"))

        rec_view.hasFixedSize()
        rec_view.layoutManager = LinearLayoutManager(this)

        rec_view.adapter = MailAdapter(list, this)
    }
}