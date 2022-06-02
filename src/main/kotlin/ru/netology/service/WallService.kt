package ru.netology.service
import ru.netology.data.Post


class WallService {

    var posts = emptyArray<Post>()
    var propertyId = 0

    fun add(post: Post): Post {
        propertyId++
        val addPost = post.copy(id = propertyId)
        posts += addPost
        return posts.last()
    }

    //обновление всех свойств поста, кроме id владельца и даты создания

    fun update(post: Post, updateWork: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index].ownerId = updateWork.ownerId
                posts[index].fromId = updateWork.fromId
                return true
            }
        }
        return false
    }
}