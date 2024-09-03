package com.example.type_safenavigation.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun MyAppNavigation(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Routes.screen_A, builder ={
        composable(Routes.screen_A){
            ScreenA(navController)
        }
        composable(Routes.screen_B+"/{name}"){
            val name=it.arguments?.getString("name")
            ScreenB(name?:"no name")
        }
    } )
}