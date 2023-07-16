package com.example.myarouter

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor

// 拦截器会在跳转之间执行，多个拦截器会按优先顺序执行
@Interceptor(priority = 1, name = "TestInterceptor")
class TestInterceptor : IInterceptor {
    override fun init(context: Context?) {
        // 拦截器初始化，会在sdk初始化的时候调用该方法，仅会调用一次
        Log.i("TestInterceptor", "TestInterceptor init")

    }

    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
        callback?.onContinue(postcard) // 处理完成，交出控制权
//        callback?.onInterrupt(RuntimeException("oops..")) // 中断
        Log.i("TestInterceptor", "process: TestInterceptor")
        if ((postcard?.path ?: "") == Path.SECOND_ACTIVITY) {
            Log.i("TestInterceptor", "跳转到第二个界面")
        }
    }
}