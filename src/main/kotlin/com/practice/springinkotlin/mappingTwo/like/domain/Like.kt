package com.practice.springinkotlin.mappingTwo.like.domain

import javax.persistence.*

@Entity
class Like(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
            var id: Long? = null,
           @Enumerated(EnumType.STRING)
           var likeType: LikeType,
           var postId: Long,
           var userId: Long) {
    constructor(likeType: LikeType, postId: Long, userId: Long):this(null, likeType, userId, postId)

}