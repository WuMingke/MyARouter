package com.example.myarouter

import android.content.Context
import android.net.Uri
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.PathReplaceService

@Route(path = "/service/replace")
class PathReplaceServiceImpl : PathReplaceService {
    override fun init(context: Context?) {
        Log.i("wmkwmk", "init: PathReplaceServiceImpl")
    }

    override fun forString(path: String?): String {
        if (path == Path.NULL_ACTIVITY) {
            Log.i("wmkwmk", "PathReplaceServiceImpl: to second activity")
            return Path.SECOND_ACTIVITY
        }
        return path ?: "不能为空"
    }

    override fun forUri(uri: Uri?): Uri {
        return Uri.EMPTY
    }
}