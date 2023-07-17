package com.example.myarouter

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.enums.RouteType
import com.alibaba.android.arouter.facade.model.RouteMeta
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            // 1 默认
//            ARouter.getInstance().build(Path.SECOND_ACTIVITY).navigation()

            // 2 携带参数
//            ARouter.getInstance().build(Path.SECOND_ACTIVITY).withString("key_1", "123").navigation()

            // 3 拦截器
//            ARouter.getInstance().build(Path.NULL_ACTIVITY).navigation(null, object : NavigationCallback {
//                override fun onFound(postcard: Postcard?) { // 局部的降级策略
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

            // 4 全局的降级策略
//            ARouter.getInstance().build(Path.NULL_ACTIVITY).navigation()

            // 5 依赖注入
//            ARouter.getInstance().navigation(HelloService::class.java).sayHello("mingke")

            // 6 预处理服务
            // PretreatmentServiceImpl

            // 7 动态注册路由
            // 适用于部分插件化架构的App以及需要动态注册路由信息的场景
            // 目标页面和服务可以不标注 @Route 注解，注意：同一批次仅允许相同 group 的路由信息注册
//            ARouter.getInstance().addRouteGroup {
//                it["/dynamic/activity"] = RouteMeta.build(
//                    RouteType.ACTIVITY, TestDynamicActivity::class.java, "/dynamic/activity", "dynamic", 0, 0
//                )
//            }
//            ARouter.getInstance().build("/dynamic/activity").navigation()

            // 8 startActivityForResult
//            ARouter.getInstance().build(Path.SECOND_ACTIVITY).navigation(this, 2)

            // 9 获取Fragment
//            val fragment: Fragment = ARouter.getInstance().build(Path.MY_FRAGMENT).navigation() as Fragment
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.add(R.id.frameLayout, fragment)
//            transaction.commitAllowingStateLoss()


            // 10 使用绿色通道(跳过所有的拦截器)
//            ARouter.getInstance().build(Path.SECOND_ACTIVITY).greenChannel().navigation()

            // 11 重写跳转URL
//            ARouter.getInstance().build(Path.NULL_ACTIVITY).navigation()


        }
    }

}