package com.practice.springinkotlin.mappingTwo.post.domain

import javax.persistence.*

@Entity
@Table(name = "posts_yj")
class Post(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
           var id: Long? = null,
           var writer: String,
           var title: String,
           var content: String,
           var likeCount: Long,
           var disLikeCount: Long,
           var userId: Long){
    constructor(writer: String, title: String, content: String, userId: Long):this(null,writer,title, content,0,0,userId)
}