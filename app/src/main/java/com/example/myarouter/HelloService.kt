package com.example.myarouter

import com.alibaba.android.arouter.facade.template.IProvider

public interface HelloService : IProvider {

    fun sayHello(name: String): String
}