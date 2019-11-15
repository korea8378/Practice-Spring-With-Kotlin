package com.practice.springinkotlin.mappingTwo.comment.domain

import javax.persistence.*

@Entity
@Table(name="comments_yj")
class Comment(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
              var id: Long? = null,
              var content: String,
              var writer: String,
              var userId: Long,
              var postId: Long) {
    constructor(writer: String, content: String, userId: Long, postId: Long):this(null, content, writer, userId, postId)
}