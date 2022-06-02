package ru.netology

import ru.netology.data.Post
import ru.netology.service.WallService


fun main() {

    val original1 = Post(
        id = 1,
        date = 4122003,
        ownerId = 1,
        fromId = 1,
//        createdBy = 1590075360,
//        authorName = "Нетология",
//        text = "Новая Нетология",
//        replyOwnerId = 2,
//        replyPostId = 3,
//        friendsOnly = 5,
//        comments = 23,
//        copyright = 54,
//        reposts = 100,
//        views = 30,
//        postType = "copy",
//        signerId = 5,
//        canPin = true,
//        canDelete = false,
//        canEdit = true,
//        isPinned = 2,
//        markedAsAds = true,
//        isFavorite = true,
//        postronedId = 6,
//        likes = 22,
    )

    val original2 = Post(
        id = 2,
        date = 4122003,
        ownerId = 6,
        fromId = 7,
//        createdBy = 1590075360,
//        authorName = "Нетология",
//        text = "Новая Нетология",
//        replyOwnerId = 2,
//        replyPostId = 3,
//        friendsOnly = 5,
//        comments = 23,
//        copyright = 54,
//        reposts = 100,
//        views = 30,
//        postType = "copy",
//        signerId = 5,
//        canPin = true,
//        canDelete = false,
//        canEdit = true,
//        isPinned = 2,
//        markedAsAds = true,
//        isFavorite = true,
//        postronedId = 6,
//        likes = 22,
    )
//
    val original3 = Post(
        id = 3,
        date = 4122003,
        ownerId = 5,
        fromId = 2,
//        createdBy = 1590075360,
//        authorName = "Нетология",
//        text = "Новая Нетология",
//        replyOwnerId = 2,
//        replyPostId = 3,
//        friendsOnly = 5,
//        comments = 23,
//        copyright = 54,
//        reposts = 100,
//        views = 30,
//        postType = "copy",
//        signerId = 5,
//        canPin = true,
//        canDelete = false,
//        canEdit = true,
//        isPinned = 2,
//        markedAsAds = true,
//        isFavorite = true,
//        postronedId = 6,
//        likes = 22,
    )

    val updateWork = Post(
        id = 2,
        date = 4122003,
        ownerId = 100,
        fromId = 150,

        )

    val wallService = WallService()

    println(wallService.add(original1))
    println(wallService.add(original2))
    println(wallService.add(original3))
    println(wallService.update(original2, updateWork))
    println(wallService.posts[0])
    println(wallService.posts[1])
    println(wallService.posts[2])

    }






