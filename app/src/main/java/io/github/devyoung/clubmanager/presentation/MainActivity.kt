package io.github.devyoung.clubmanager.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import io.github.devyoung.clubmanager.presentation.scene.main.MainScreen
import io.github.devyoung.clubmanager.presentation.ui.theme.ClubManagerTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClubManagerTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = MainRouter.SignIn.destination) {

                    composable(MainRouter.SignIn.destination) { backStackEntry ->
                        MainScreen() {
                            navController.navigate(route = MainRouter.ScheduleList.destination)
                        }
                    }
                    composable(MainRouter.ScheduleList.destination) { backStackEntry ->
                        MainScreen() {
                            finish()
                        }
                    }
                }
            }
        }
    }
}