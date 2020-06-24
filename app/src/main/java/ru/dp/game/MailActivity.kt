package ru.dp.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_mail.*

class MailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mail)

        val list = ArrayList<MailItem>()
        list.add(MailItem(R.drawable.ic_baseline_add_circle, "Title", "Text 1"))
        list.add(MailItem(R.drawable.ic_baseline_help_outline_24, "Title", "Text 2"))
        list.add(MailItem(R.drawable.ic_launcher_foreground, "New message", "New message k k k kk kkkkkk kkkkk kk kkk"))
        list.add(MailItem(R.drawable.ic_baseline_add_circle, "Title", "Text 1"))
        list.add(MailItem(R.drawable.ic_baseline_help_outline_24, "Title", "Text 2"))
        list.add(MailItem(R.drawable.ic_launcher_foreground, "New message", "New message k k k kk kkkkkk kkkkk kk kkk"))
        list.add(MailItem(R.drawable.ic_baseline_add_circle, "Title", "Text 1"))
        list.add(MailItem(R.drawable.ic_baseline_help_outline_24, "Title", "Text 2"))
        list.add(MailItem(R.drawable.ic_launcher_foreground, "New message", "New message k k k kk kkkkkk kkkkk kk kkk"))
        list.add(MailItem(R.drawable.ic_baseline_add_circle, "Title", "Text 1"))
        list.add(MailItem(R.drawable.ic_baseline_help_outline_24, "Title", "Text 2"))
        list.add(MailItem(R.drawable.ic_launcher_foreground, "New message", "New message k k k kk kkkkkk kkkkk kk kkk"))
        list.add(MailItem(R.drawable.ic_baseline_add_circle, "Title", "Text 1"))
        list.add(MailItem(R.drawable.ic_baseline_help_outline_24, "Title", "Text 2"))
        list.add(MailItem(R.drawable.ic_launcher_foreground, "New message", "New message k k k kk kkkkkk kkkkk kk kkk"))
        list.add(MailItem(R.drawable.ic_baseline_add_circle, "Title", "Text 1"))
        list.add(MailItem(R.drawable.ic_baseline_help_outline_24, "Title", "Text 2"))
        list.add(MailItem(R.drawable.ic_launcher_foreground, "New message", "New message k k k kk kkkkkk kkkkk kk kkk"))
        list.add(MailItem(R.drawable.ic_baseline_add_circle, "Title", "Text 1"))
        list.add(MailItem(R.drawable.ic_baseline_help_outline_24, "Title", "Text 2"))
        list.add(MailItem(R.drawable.ic_launcher_foreground, "New message", "New message k k k kk kkkkkk kkkkk kk kkk"))
        list.add(MailItem(R.drawable.ic_baseline_add_circle, "Title", "Text 1"))
        list.add(MailItem(R.drawable.ic_baseline_help_outline_24, "Title", "Text 2"))
        list.add(MailItem(R.drawable.ic_launcher_foreground, "New message", "New message k k k kk kkkkkk kkkkk kk kkk"))

        rec_view.hasFixedSize()
        rec_view.layoutManager = LinearLayoutManager(this)

        rec_view.adapter = MailAdapter(list, this)
    }
}