package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.screen.ConsumerHomeScreen
import com.example.myapplication.screen.ProfileScreen
import com.example.myapplication.screen.SelectionContextScreen
import com.example.myapplication.screen.SidebarMenu
import com.example.myapplication.screen.SplashScreen

@Composable
fun NavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Routes.SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(Routes.SPLASH) {
            SplashScreen(
                onTimeout = {
                    navController.navigate(Routes.SELECTION_CONTEXT) {
                        popUpTo(Routes.SPLASH) { inclusive = true }
                    }
                }
            )
        }
        composable(Routes.SELECTION_CONTEXT) {
            SelectionContextScreen(
                onClickContext = {
                    navController.navigate(Routes.CONSUMER_HOME)
                }
            )
        }
        composable(Routes.CONSUMER_HOME) {
            ConsumerHomeScreen(
                onOpenMenu = {
                    navController.navigate(Routes.SIDEBAR_MENU)
                }
            )
        }
        composable(Routes.SIDEBAR_MENU) {
            SidebarMenu(
                onNavigate = { route ->
                    if (route == "perfil" || route == Routes.PROFILE) {
                        navController.navigate(Routes.PROFILE)
                    }
                },
                onLogout = {
                    navController.navigate(Routes.SELECTION_CONTEXT) {
                        popUpTo(Routes.SELECTION_CONTEXT) { inclusive = true }
                    }
                }
            )
        }
        composable(Routes.PROFILE) {
            ProfileScreen(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}
