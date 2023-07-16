package com.example.myarouter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            // 默认
//            ARouter.getInstance().build(Path.SECOND_ACTIVITY).navigation()

            // 携带参数
//            ARouter.getInstance().build(Path.SECOND_ACTIVITY).withString("key_1", "123").navigation()

            // 拦截器
//            ARouter.getInstance().build(Path.SECOND_ACTIVITY).navigation(null, object : NavigationCallback {
//                override fun onFound(postcard: Postcard?) {
//                    Log.i("TestInterceptor", "onFound...")
//                }
//
//                override fun onLost(postcard: Postcard?) {
//                    Log.i("TestInterceptor", "onLost...")
//                }
//
//                override fun onArrival(postcard: Postcard?) {
//                    Log.i("TestInterceptor", "onArrival...")
//                }
//
//                override fun onInterrupt(postcard: Postcard?) {
//                    Log.i("TestInterceptor", "onInterrupt...")
//                }
//
//            })

//                https://juejin.cn/post/6981263258015498248#heading-17
//            https://github.com/alibaba/ARouter/blob/master/README_CN.md
        }
    }

}