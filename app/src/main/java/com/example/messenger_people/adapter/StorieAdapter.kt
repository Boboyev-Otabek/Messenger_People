package com.example.messenger_people.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messenger_people.R
import com.example.messenger_people.model.Storie
import com.google.android.material.imageview.ShapeableImageView

class StorieAdapter(var context: Context, var item: ArrayList<Storie>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var item_type_i=0
    var item_type_friends=1

    fun isI(position: Int):Boolean{
        return position==0
    }

    override fun getItemViewType(position: Int): Int {
        if(isI(position)) return item_type_i
        return item_type_friends
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       if(viewType==item_type_i){
           val view :View= LayoutInflater.from(parent.context).inflate(R.layout.i_view, parent, false)
           return IViewholder(view)
       }

        val view :View= LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return StorieViewholder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var storie = item[position]

        if (holder is StorieViewholder) {
            var back_font = holder.back_font
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_count = holder.tv_count

            back_font.setImageResource(storie.back_font)
            iv_profile.setImageResource(storie.profile)
            tv_fullname.text = storie.fullname
            tv_count.text = storie.count.toString()
        }


        if(holder is IViewholder){
            var back_font = holder.back_font
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname


            back_font.setImageResource(storie.back_font)
            iv_profile.setImageResource(storie.profile)
            tv_fullname.text = storie.fullname

        }
    }

    class IViewholder(view: View) : RecyclerView.ViewHolder(view) {
        var back_font: ShapeableImageView
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView


        init {
            back_font = view.findViewById(R.id.back_font)
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)

        }


    }

    class StorieViewholder(view: View) : RecyclerView.ViewHolder(view) {
        var back_font: ShapeableImageView
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var tv_count: TextView

        init {
            back_font = view.findViewById(R.id.back_font)
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
            tv_count = view.findViewById(R.id.tv_count)
        }


    }
}