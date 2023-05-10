package com.example.sdk_library

import android.content.Context
import android.widget.Toast

fun showToast(mContext: Context, text : String){
    Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show()

}