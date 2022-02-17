package com.app40.jickbangcopy_20110217

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app40.jickbangcopy_20110217.adapters.RoomAdapter
import com.app40.jickbangcopy_20110217.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mRoomList.add(RoomData(8000,"서울시 동대문구",7,"1번째 방입니다"))
        mRoomList.add(RoomData(19000,"서울시 서대문구",2,"2번째 방입니다"))
        mRoomList.add(RoomData(15600,"서울시 동작구",3,"3번째 방입니다"))
        mRoomList.add(RoomData(3800,"서울시 강남구",-1,"4번째 방입니다"))
        mRoomList.add(RoomData(56000,"서울시 은평구",0,"5번째 방입니다"))
        mRoomList.add(RoomData(6800,"서울시 성북구",-7,"6번째 방입니다"))
        mRoomList.add(RoomData(34000,"경기도 고양시",15,"7번째 방입니다"))
        mRoomList.add(RoomData(2000,"경기도 남양주시",0,"8번째 방입니다"))
        mRoomList.add(RoomData(72000,"경기도 분당구",13,"9번째 방입니다"))

        mRoomAdapter = RoomAdapter(this,R.layout.room_list_item,mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("priceInfo",clickedRoom.getFormattedPrice())
            startActivity(myIntent)

        }

    }
}