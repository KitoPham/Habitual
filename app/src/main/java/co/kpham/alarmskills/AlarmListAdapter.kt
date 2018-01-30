package co.kpham.alarmskills

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.alarm_list.view.*
import java.util.*

/**
 * Created by kpham on 1/11/2018.
 */
class AlarmListAdapter(val alarmArray : Array<Alarm>) : RecyclerView.Adapter<AlarmListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder{
        val v : View = LayoutInflater.from(parent.getContext()).inflate(R.layout.alarm_list, parent, false)
        return ViewHolder(v)
    }


    override fun getItemCount(): Int {
        return alarmArray.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val alarm : Alarm = alarmArray[position]
        holder.bind(alarm)
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(alarm : Alarm){
            itemView.alarmTime.text = alarm.time;
            if (alarm.dayIndicator){
                itemView.dayIndicator.setText(R.string.daytext)
            } else {
                itemView.dayIndicator.setText(R.string.nighttext)
            }
            itemView.alarmOn.isChecked = alarm.state;



        }


    }
}