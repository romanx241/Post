package ru.netology

import ru.netology.data.Post
import ru.netology.service.WallService
import ru.netology.service.WallService.posts


fun main() {


    val original1 = Post(
        id = 1,
        ownerId = 1,
        fromId = 1,
        createdBy = 1590075360,
        authorName = "Нетология",
        date = 4122003,
        text = "Новая Нетология",
        replyOwnerId = 2,
        replyPostId = 3,
        friendsOnly = 5,
        comments = 23,
        copyright = 54,
        reposts = 100,
        views = 30,
        postType = "copy",
        signerId = 5,
        canPin = true,
        canDelete = false,
        canEdit = true,
        isPinned = 2,
        markedAsAds = true,
        isFavorite = true,
        postronedId = 6,
        likes = 22,
    )

    val original2 = Post(
        id = 2,
        ownerId = 1,
        fromId = 1,
        createdBy = 1590075360,
        authorName = "Нетология",
        date = 4122003,
        text = "Новая Нетология",
        replyOwnerId = 2,
        replyPostId = 3,
        friendsOnly = 5,
        comments = 23,
        copyright = 54,
        reposts = 100,
        views = 30,
        postType = "copy",
        signerId = 5,
        canPin = true,
        canDelete = false,
        canEdit = true,
        isPinned = 2,
        markedAsAds = true,
        isFavorite = true,
        postronedId = 6,
        likes = 22,
    )

    val original3 = Post(
        id = 3,
        ownerId = 1,
        fromId = 1,
        createdBy = 1590075360,
        authorName = "Нетология",
        date = 4122003,
        text = "Новая Нетология",
        replyOwnerId = 2,
        replyPostId = 3,
        friendsOnly = 5,
        comments = 23,
        copyright = 54,
        reposts = 100,
        views = 30,
        postType = "copy",
        signerId = 5,
        canPin = true,
        canDelete = false,
        canEdit = true,
        isPinned = 2,
        markedAsAds = true,
        isFavorite = true,
        postronedId = 6,
        likes = 22,
    )

    println(WallService.getInstance())

    WallService.add(original1)
    WallService.add(original2)
    WallService.add(original3)

    println(WallService.update(original2))

    for(i in 0 until posts.size){
        println(posts[i])
    }

}





