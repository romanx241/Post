package ru.netology.data

data class Post(

    var id: Long,
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val authorName: String,
    val date: Long,
    val text: String,
    val replyOwnerId: Long,
    val replyPostId: Long,
    val friendsOnly: Int,
    val comments: Long,
    val copyright: Long,
    val reposts: Long,
    val views: Long,
    val postType: String,
    val signerId: Long,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Long,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postronedId: Long,
    var likes: Long
)
