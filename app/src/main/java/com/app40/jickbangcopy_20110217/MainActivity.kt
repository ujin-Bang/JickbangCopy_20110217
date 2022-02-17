package com.app40.jickbangcopy_20110217

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app40.jickbangcopy_20110217.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(3000,"서울시 동대문구",1,"첫번째 방입니다."))
        mRoomList.add(RoomData(17000,"서울시 서대문구",1,"첫번째 방입니다."))
        mRoomList.add(RoomData(65000,"서울시 남대문구",1,"첫번째 방입니다."))
        mRoomList.add(RoomData(12000,"서울시 중랑구",1,"첫번째 방입니다."))
        mRoomList.add(RoomData(8000,"서울시 노원구",1,"첫번째 방입니다."))
        mRoomList.add(RoomData(5000,"서울시 종루구",-1,"첫번째 방입니다."))
        mRoomList.add(RoomData(6700,"서울시 강남구",0,"첫번째 방입니다."))
        mRoomList.add(RoomData(72000,"서울시 은평구",51,"첫번째 방입니다."))
        mRoomList.add(RoomData(4000,"서울시 동작구",21,"첫번째 방입니다."))
        mRoomList.add(RoomData(99000,"서울시 중구",0,"첫번째 방입니다."))

    }
}