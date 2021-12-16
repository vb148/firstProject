package com.example.mypaint

import android.graphics.Path

class Stroke     // constructor to initialise the attributes
    (// color of the stroke
    var color: Int, // width of the stroke
    var strokeWidth: Int, // a Path object to
    // represent the path drawn
    var path: Path
)