package com.practice.springinkotlin.mappingOne.user.domain

import com.practice.springinkotlin.mappingOne.post.domain.Post
import javax.persistence.*


//ManyToOne 단방향
//@Entity
//class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
//           var userId: String,
//           var password: String,
//           var name: String,
//           var age: Long)


//oneToMany 단방향
//@Entity
//class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
//           var userId: String,
//           var password: String,
//           var name: String,
//           var age: Long,
//           @OneToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
//           @JoinColumn(name = "userId")
//           var list: MutableList<Post>)


// 양방향
@Entity
class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
           var userId: String,
           var password: String,
           var name: String,
           var age: Long,
           @OneToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE], mappedBy = "user")
           var list: MutableList<Post>)