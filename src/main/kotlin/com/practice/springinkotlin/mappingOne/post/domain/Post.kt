package com.practice.springinkotlin.mappingOne.post.domain

import javax.persistence.*



//@ManyToOne 단방향
//class Post(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//           var id: Long,
//           var writer: String,
//           var title: String,
//           var content: String,
//           var likeCount: Long,
//           var disLikeCount: Long,
//           @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
//           @JoinColumn(name = "user_id")
//           var user: User)

//@OneToMany 단방향
@Entity
class Post(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
           var id: Long,
           var writer: String,
           var title: String,
           var content: String,
           var likeCount: Long,
           var disLikeCount: Long,
           var userId: Long)

//양방향
//@Entity
//class Post(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//           var id: Long,
//           var writer: String,
//           var title: String,
//           var content: String,
//           var likeCount: Long,
//           var disLikeCount: Long,
//           @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
//           @JoinColumn(name = "user_id")
//           var user: User)