package com.practice.springinkotlin.mappingTwo.like.domain

import javax.persistence.*

@Entity
class Likes(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
            var id: Long? = null,
           @Enumerated(EnumType.STRING)
           var likesType: LikesType,
           var postId: Long,
           var userId: Long)