package co.kpham.alarmskills

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.LinearLayoutManager
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.alarm_list_fragment.*
import kotlinx.android.synthetic.main.alarm_list_fragment.view.*
import java.util.*


/**
 * Created by kpham on 1/11/2018.
 */

class AlarmListFragment : Fragment(){
    companion object {

        fun newInstance(): AlarmListFragment {
            return AlarmListFragment()
        }
    }

    //3
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.alarm_list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val alarmArray = arrayOf(
                Alarm("8:00", true, false),
                Alarm("7:00", false, true),
                Alarm("6:00", true, true),
                Alarm("10:00", false, true),
                Alarm("8:30", true, true)
        )

        val alarmQueue = PriorityQueue<Alarm>()
        Arrays.sort(alarmArray)
        val alarmAdaptor = AlarmListAdapter(alarmArray)
        alarmListView.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
        alarmListView.adapter = alarmAdaptor

        button.setOnClickListener{addAlarmClick()}

    }

    fun addAlarmClick(){

    }
}