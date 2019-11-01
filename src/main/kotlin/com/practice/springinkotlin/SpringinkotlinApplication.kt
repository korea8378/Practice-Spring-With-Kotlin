package com.practice.springinkotlin

import com.practice.springinkotlin.mappingOne.post.domain.Post
import com.practice.springinkotlin.mappingOne.post.domain.PostOneRepository
import com.practice.springinkotlin.mappingOne.user.domain.User
import com.practice.springinkotlin.mappingOne.user.domain.UserOneRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.Transactional

@SpringBootApplication
class SpringinkotlinApplication : CommandLineRunner {
    @Autowired
    lateinit var userOneRepository: UserOneRepository

    @Autowired
    lateinit var postOneRepository: PostOneRepository

    //단방향 ManyToOne
//	@Transactional
//	override fun run(vararg args: String?) {
//		var user: User = User(null, "user1", "user1", "lee", 24L)
//
//		user = userOneRepository.save(user)
//
//		val postOne: Post = Post(null, "lee", "title1", "content1", 0L, 0L, user)
//		val postTwo: Post = Post(null, "lee2", "title2", "content2", 0L, 0L, user)
//
//		postOneRepository.save(postOne)
//		postOneRepository.save(postTwo)
//
//		userOneRepository.deleteAll()
//		postOneRepository.deleteAll()
//	}

    //단방향 oneToMany
//	@Transactional
//	override fun run(vararg args: String?) {
//
//		var user: User = User(null, "user1", "user1", "lee", 24L, mutableListOf())
//
//		user = userOneRepository.save(user)
//
//		val postOne: Post = Post(null, "lee", "title1", "content1", 0L, 0L, user.id!!)
//		val postTwo: Post = Post(null, "lee2", "title2", "content2", 0L, 0L, user.id!!)
//
//		user.list.add(postOne)
//		user.list.add(postTwo)
//
//		userOneRepository.deleteAll()
//		postOneRepository.deleteAll()
//
//	}


    //양방향
    @Transactional
    override fun run(vararg args: String?) {
        var user: User = User(null, "user1", "user1", "lee", 24L, mutableListOf())

        user = userOneRepository.save(user)

        val postOne: Post = Post(null, "lee", "title1", "content1", 0L, 0L, user)
        val postTwo: Post = Post(null, "lee2", "title2", "content2", 0L, 0L, user)

        user.list.add(postOne)
        user.list.add(postTwo)

        userOneRepository.deleteAll()
        postOneRepository.deleteAll()
    }
}

fun main(args: Array<String>) {
    runApplication<SpringinkotlinApplication>(*args)
}
