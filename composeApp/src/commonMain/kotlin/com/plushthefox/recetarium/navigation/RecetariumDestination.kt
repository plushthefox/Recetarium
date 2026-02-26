package com.plushthefox.recetarium.navigation

interface RecetariumDestination {
    val route: String
}


object RecipeList: RecetariumDestination {
    override val route = "recipe_list"
}