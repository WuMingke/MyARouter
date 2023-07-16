package com.example.myarouter

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService

// 实现DegradeService接口，并加上一个Path内容任意的注解即可
@Route(path = "/xxx/xxx")
class DegradeServiceImpl : DegradeService {
    override fun init(context: Context?) {
        Log.i("wmkwmk", "init 全局降级策略。。")
    }

    override fun onLost(context: Context?, postcard: Postcard?) {
        Log.i("wmkwmk", "全局降级策略..onLost..")
    }
}