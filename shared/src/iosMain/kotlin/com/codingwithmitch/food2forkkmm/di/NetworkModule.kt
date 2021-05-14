package com.codingwithmitch.food2forkkmm.di

import com.codingwithmitch.food2forkkmm.datasource.network.KtorClientFactory
import com.codingwithmitch.food2forkkmm.datasource.network.RecipeService
import com.codingwithmitch.food2forkkmm.datasource.network.RecipeServiceImpl
import com.codingwithmitch.food2forkkmm.datasource.network.model.RecipeDtoMapper

class NetworkModule {

    val dtoMapper: RecipeDtoMapper by lazy{RecipeDtoMapper()}
    val recipeService: RecipeService by lazy {
        RecipeServiceImpl(
            recipeDtoMapper = dtoMapper,
            httpClient = KtorClientFactory().build(),
            baseUrl = RecipeServiceImpl.BASE_URL
        )
    }

}








