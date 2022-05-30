package ru.netology.service
import ru.netology.data.Post


object WallService {


    private var instance: WallService? = null

    fun getInstance(): WallService {
        if (instance == null) {
            instance = WallService
        }
        return instance!!
    }


    var posts = emptyArray<Post>()
    var propertyId = 0

    fun add(post: Post): Post {
        propertyId++
        post.id = propertyId.toLong()
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val id = 2L
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post
                return true
            }
        }
        return false
    }
}