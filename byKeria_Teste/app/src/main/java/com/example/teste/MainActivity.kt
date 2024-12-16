package com.example.teste
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") { SplashScreen(navController) }
        composable("main") {
            MainScreenLayout(navController) { paddingValues ->
                HomeScreen(navController, paddingValues)
            }
        }
        composable("sobre") {
            MainScreenLayout(navController) { paddingValues ->
                SobreScreen(navController, paddingValues)
            }
        }
        composable("settings") {
            MainScreenLayout(navController) { paddingValues ->
                SettingsScreen(navController, paddingValues)
            }
        }

    }
}






@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}


