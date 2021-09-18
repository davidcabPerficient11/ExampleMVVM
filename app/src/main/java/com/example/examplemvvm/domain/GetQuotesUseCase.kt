package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    /*
    Using invoke allow us to call and use the function
    just by using the class name ei GetQuotesUseCase()
    will automatically call the invoke class

    Also there can only be 1 invoke function per class
     */

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}