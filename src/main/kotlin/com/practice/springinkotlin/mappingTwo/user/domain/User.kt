package com.practice.springinkotlin.mappingTwo.user.domain

import javax.persistence.*

@Entity
@Table(name = "users_yj")
class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
           var userId: String,
           var password: String,
           var name: String,
           var age: Int) {

    constructor(userId: String, password: String, name: String, age: Int): this(null, userId, password, name, age)
}