package com.example.myarouter

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = Path.HELLO_SERVICE_PROVIDER, name = "xx服务 desc")
public class HelloServiceImpl : HelloService {
    override fun sayHello(name: String): String {
        Log.i("wmkwmk", "sayHello: hello $name")
        return "hello $name"
    }

    override fun init(context: Context?) {
        Log.i("wmkwmk", "HELLO_SERVICE_PROVIDER  init")
    }
}