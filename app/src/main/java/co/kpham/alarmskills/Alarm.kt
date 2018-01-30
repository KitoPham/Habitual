package co.kpham.alarmskills

import android.os.Parcel
import android.os.Parcelable
import java.sql.Array
import java.util.*


/**
 * Created by kpham on 1/18/2018.
 */

class Alarm(var time:String, var dayIndicator: Boolean, var state:Boolean): Comparable<Alarm>{
    override fun compareTo(other: Alarm): Int {
        if (dayIndicator==false && other.dayIndicator == true){
            return 1
        } else if (dayIndicator == other.dayIndicator){
            return 0
        } else {
            return -1
        }
    }
}