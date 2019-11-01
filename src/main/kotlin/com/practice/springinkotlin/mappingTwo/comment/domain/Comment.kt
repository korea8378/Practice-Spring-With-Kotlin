package com.practice.springinkotlin.mappingTwo.comment.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Comment(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
              var id: Long? = null,
              var content: String,
              var writer: String,
              var userId: Long,
              var postId: Long)