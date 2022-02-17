package com.app40.jickbangcopy_20110217.datas

import java.text.NumberFormat
import java.util.*

class RoomData(
    val price: Int,
    val address : String,
    val floor: Int,
    val description : String,
) {

    fun getFormattedPrice(): String{

        if(this.price <10000) {
            return NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
        }
        else {
            return NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

        }

    }

    fun getFormattedFloor() : String {

        if(this.floor > 0) {
            return "${this.floor}층"
        }
        else if (this.floor ==0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor} 층" //-2 => 지하-2층으로 나온다
        }
    }
}