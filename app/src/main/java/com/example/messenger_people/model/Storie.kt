package com.example.messenger_people.model

class Storie {
    var back_font: Int
    var profile: Int
    var fullname: String
    var count: Int=0

    constructor(back_font: Int, profile: Int, fullname: String) {
        this.back_font = back_font
        this.profile = profile
        this.fullname = fullname
    }

    constructor(back_font: Int, profile: Int, fullname: String, count: Int) {
        this.back_font = back_font
        this.profile = profile
        this.fullname = fullname
        this.count=count
    }
}