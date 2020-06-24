package ru.dp.game

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MailAdapter(listArray: ArrayList<MailItem>, context: Context):RecyclerView.Adapter<MailAdapter.ViewHolder> (){

    var listArray_mail = listArray
    var context_mail = context


    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val mail_icon = view.findViewById<ImageView>(R.id.mail_image_icon)
        val mail_title = view.findViewById<TextView>(R.id.mail_title_text)
        val mail_text = view.findViewById<TextView>(R.id.mail_text)

        fun bind (listItem: MailItem, context: Context){

            mail_icon.setImageResource(listItem.mail_image)
            mail_title.text = listItem.mail_title
            mail_text.text = listItem.mail_text
            itemView.setOnClickListener(){
                Toast.makeText(context, "click : ${mail_text.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context_mail)
        return ViewHolder(inflater.inflate(R.layout.item_layout, parent,false))
    }

    override fun getItemCount(): Int {
        return listArray_mail.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = listArray_mail[position]
        holder.bind(listItem, context_mail)
    }
}