package com.example.myarouter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = Path.SECOND_ACTIVITY)
class SecondActivity : AppCompatActivity() {

    @Autowired(name = "key_1")
    @JvmField
    var keyString = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        ARouter.getInstance().inject(this)

        val tv = findViewById<TextView>(R.id.tv)
        tv.text = keyString

    }
}

