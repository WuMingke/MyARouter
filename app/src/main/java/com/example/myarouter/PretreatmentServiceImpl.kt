package com.example.myarouter

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.PretreatmentService

@Route(path = "/x/x")
public class PretreatmentServiceImpl : PretreatmentService {
    override fun init(context: Context?) {
        Log.i("wmkwmk", "init: PretreatmentServiceImpl")
    }

    override fun onPretreatment(context: Context?, postcard: Postcard?): Boolean {
        Log.i("wmkwmk", "预处理。。。")
        // 跳转前预处理，如果需要自行处理跳转，该方法返回 false 即可
        return true
    }
}