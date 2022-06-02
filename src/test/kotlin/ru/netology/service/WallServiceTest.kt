package ru.netology.service

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*
import ru.netology.data.Post

class WallServiceTest {

    val wallService = WallService()

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {

    }

    @Test
    fun add() {
        val expectedId = 1
        val post = Post(0, 4122003, 6, 7)
        val actualId = wallService.add(post).id

        assertEquals(expectedId, actualId)
    }


// проверка на изменение поста с существующим id
    
    @Test
    fun updateExisting() {

        val service = WallService()

        service.add(Post(0, 4122003, 6, 7))
        service.add(Post(1, 4122003, 7, 9))
        service.add(Post(2, 4122003, 8, 12))

        val update = Post(2, 4122003, 100, 150)

        val result = service.update(service.posts[1], update)

        assertTrue(result)
    }

    // проверка на изменение поста с несуществующим id

    @Test
    fun updateExistingNon() {

        val service = WallService()

        service.add(Post(0, 4122003, 6, 7))
        service.add(Post(1, 4122003, 7, 9))
        service.add(Post(2, 4122003, 8, 12))

        val update = Post(2, 4122003, 100, 150)

        val result = service.update(service.posts[5], update)

        assertTrue(result)
    }
}



