package com.example.reader.network

import com.example.reader.model.Book
import com.example.reader.model.Item
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Singleton


@Singleton
interface BooksApi {

    //https://www.googleapis.com/books/v1/volumes?q=futter
    @GET("volumes")
    suspend fun getAllBooks(@Query("q") query: String): Book


    // https://www.googleapis.com/books/v1/volumes/
    @GET("volumes/{bookId}")
    suspend fun getBookInfo(@Path("bookId") bookId:String): Item
}