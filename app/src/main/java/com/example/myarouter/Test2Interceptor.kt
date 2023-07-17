package com.example.myarouter

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor

@Interceptor(priority = 2, name = "Test2Interceptor")
class Test2Interceptor : IInterceptor {
    override fun init(context: Context?) {
        Log.i("TestInterceptor", "Test2Interceptor init")
    }

    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
        callback?.onContinue(postcard)
//        callback?.onInterrupt(RuntimeException("oops..."))
        Log.i("TestInterceptor", "process: Test2Interceptor == ")
    }
}