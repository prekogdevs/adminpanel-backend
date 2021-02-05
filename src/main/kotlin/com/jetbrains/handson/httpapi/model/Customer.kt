package com.jetbrains.handson.httpapi.model

import kotlinx.serialization.Serializable

val customerStorage = mutableListOf(
    Customer("1", "Kis", "Elemér", "kiselemer@gmail.com", "https://i.pinimg.com/564x/e0/95/ba/e095ba516be342b0dba2dd8fee99da3a.jpg"),
    Customer("2", "Közepes", "Elemér", "kozepeselemer@gmail.com", "https://64.media.tumblr.com/074dc76ef8d958f937632a64d4444026/tumblr_p0jph4AMXw1vsss7oo1_250.png"),
    Customer("3", "Nagy", "Elemér", "nagyelemer@gmail.com", "https://avatarfiles.alphacoders.com/715/thumb-1920-71553.jpg")
)

@Serializable
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String, val avatarUrl : String)