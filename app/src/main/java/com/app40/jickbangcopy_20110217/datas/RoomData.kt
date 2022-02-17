package com.app40.jickbangcopy_20110217.datas

class RoomData(
    val price: Int,
    val address : String,
    val floor: Int,
    val description : String,
) {

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