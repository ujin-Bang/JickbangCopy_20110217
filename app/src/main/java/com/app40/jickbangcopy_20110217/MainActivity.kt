package com.app40.jickbangcopy_20110217

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app40.jickbangcopy_20110217.adatpers.RoomAdapter
import com.app40.jickbangcopy_20110217.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter: RoomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(3000,"서울시 동대문구",13,"두번째 방입니다."))
        mRoomList.add(RoomData(17000,"서울시 서대문구",4,"세번째 방입니다."))
        mRoomList.add(RoomData(65000,"서울시 남대문구",-2,"네번째 방입니다."))
        mRoomList.add(RoomData(12000,"서울시 중랑구",0,"다섯번째 방입니다."))
        mRoomList.add(RoomData(8000,"서울시 노원구",18,"여섯번째 방입니다."))
        mRoomList.add(RoomData(5000,"서울시 종루구",-1,"7번째 방입니다."))
        mRoomList.add(RoomData(6700,"서울시 강남구",0,"8번째 방입니다."))
        mRoomList.add(RoomData(72000,"서울시 은평구",51,"9번째 방입니다."))
        mRoomList.add(RoomData(4000,"서울시 동작구",21,"9번째 방입니다."))
        mRoomList.add(RoomData(99000,"서울시 중구",0,"11번째 방입니다."))

        mRoomAdapter = RoomAdapter(this,R.layout.room_list_item,mRoomList)
        roomListView.adapter = mRoomAdapter

    }
}