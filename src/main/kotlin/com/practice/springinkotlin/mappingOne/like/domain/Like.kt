package com.practice.springinkotlin.mappingOne.like.domain

import javax.persistence.*

@Entity
class Like(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
           var id: Long,
           @Enumerated(EnumType.STRING)
           var likeType: LikeType,
           var postId: Long,
           var userId: Long)