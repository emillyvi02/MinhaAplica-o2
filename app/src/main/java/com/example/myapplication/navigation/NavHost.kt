package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.screen.SelectionContextScreen

@Composable
fun NavHost(
    navController: NavHostController = rememberNavController()
){
    NavHost(navController = navController,
        startDestination = Routes.SELECTION_CONTEXT
        ){
        composable(Routes.SELECTION_CONTEXT){
            SelectionContextScreen(onClickContext = {navController.navigate(Routes.Home())})
        }
        composable(Routes.CONSUMER_HOME){
            SelectionContextScreen(onClickContext = {navController.navigate(Routes.Home())})
        }
    }

}