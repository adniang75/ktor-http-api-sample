package com.jetbrains.handson.httpapi.models

import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String)

val customerStorage = mutableListOf(
    Customer("1", "John", "Doe", "johndoe@example.com"),
    Customer("2", "Jane", "Doe", "janedoe@example.com"),
    Customer("3", "Elon", "Musk", "elonmusk@example.com"),
    Customer("4", "Jeff", "Bezos", "jeffbezos@example.com"),
    Customer("5", "Barack", "Obama", "barackobama@example.com")
)

