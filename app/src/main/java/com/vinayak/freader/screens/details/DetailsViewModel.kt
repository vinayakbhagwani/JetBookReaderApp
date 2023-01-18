package com.vinayak.freader.screens.details

import androidx.lifecycle.ViewModel
import com.vinayak.freader.data.Resource
import com.vinayak.freader.model.Item
import com.vinayak.freader.repository.BookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val repository: BookRepository)

    : ViewModel(){
        suspend fun getBookInfo(bookId: String): Resource<Item> {
            return repository.getBookInfo(bookId)
        }
    }