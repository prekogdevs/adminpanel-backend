package com.jetbrains.handson.httpapi.model

import kotlinx.serialization.Serializable

val customerStorage = mutableListOf(
    Customer("1", "Kis", "Elemér", "kiselemer@gmail.com"),
    Customer("2", "Közepes", "Elemér", "kozepeselemer@gmail.com"),
    Customer("3", "Nagy", "Elemér", "nagyelemer@gmail.com")
)

@Serializable
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String)