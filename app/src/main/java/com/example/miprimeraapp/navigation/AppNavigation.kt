package com.example.miprimeraapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.miprimeraapp.Lista.messages
import com.example.miprimeraapp.MainScreen
import com.example.miprimeraapp.SplashScreen
import com.example.miprimeraapp.TextScreen
import androidx.navigation.NavHostController
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.example.miprimeraapp.MyMessage

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = AppScreens.SplashScreen.route
    ) {
        composable(AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(AppScreens.MainScreen.route) {
            MainScreen(navController, messages)
        }
        composable(
            route = "textScreen/{image}/{title}/{welcome}",
            arguments = listOf(
                navArgument("image") { type = NavType.IntType },
                navArgument("title") { type = NavType.StringType },
                navArgument("welcome") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val image = backStackEntry.arguments?.getInt("image") ?: 0
            val title = backStackEntry.arguments?.getString("title") ?: ""
            val welcome = backStackEntry.arguments?.getString("welcome") ?: ""
            val message = MyMessage(image, title, welcome)
            TextScreen(navController, message)
        }
    }
}