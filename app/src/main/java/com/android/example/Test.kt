package com.android.example

import java.util.Date

class Test {
    // We have a custom lint check bundled with :library
    // that this module depends on. The lint check looks
    // for mentions of "lint", which should trigger an
    // error
    val s = "lint"
    fun lint() {
      val date = Date()
    }
}
