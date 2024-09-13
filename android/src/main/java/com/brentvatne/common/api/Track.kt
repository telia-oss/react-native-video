package com.brentvatne.common.api

/*
* internal representation of audio & text tracks
*/
class Track {
    var title: String? = null
    var mimeType: String? = null
    var language: String? = null
    var isSelected = false
    var isSupported = true
    var roleFlags: List<String> = emptyList()

    // in bps available only on audio tracks
    var bitrate = 0
    var index = 0
}
