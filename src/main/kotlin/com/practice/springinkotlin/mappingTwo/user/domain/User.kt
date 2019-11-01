package com.practice.springinkotlin.mappingTwo.user.domain

import javax.persistence.*

@Entity
class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)var id: Long? = null,
           var userId: String,
           var password: String,
           var name: String,
           var age: Long) {

    constructor(userId: String, password: String, name: String, age: Long): this(null, userId, password, name, age)
}