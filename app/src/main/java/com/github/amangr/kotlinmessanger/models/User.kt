package com.github.amangr.kotlinmessanger.models

class User(val uid: String, val username: String, val profileImageUri: String) {
    constructor() : this("","","")
}