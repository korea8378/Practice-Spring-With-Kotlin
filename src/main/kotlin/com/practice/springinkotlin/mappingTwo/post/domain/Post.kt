package com.practice.springinkotlin.mappingTwo.post.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Post(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
           var id: Long? = null,
           var writer: String,
           var title: String,
           var content: String,
           var likeCount: Long,
           var disLikeCount: Long,
           var userId: Long)