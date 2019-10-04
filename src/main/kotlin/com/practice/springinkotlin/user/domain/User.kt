package com.practice.springinkotlin.user.domain

import javax.persistence.*


@Entity
@Table(name = "user")
class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
           var id: Long? = null,
           var name: String,
           var age: Long) {

    constructor(name: String, age: Long) : this(null, name, age)

    fun updateInfo(name: String, age: Long) {
        this.name = name
        this.age = age
    }
}