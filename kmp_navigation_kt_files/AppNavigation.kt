package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "list"
    ) {

        composable("list") {
            DeviceListScreen(navController)
        }

        composable("detail/{deviceName}") { backStackEntry ->

            val deviceName =
                backStackEntry.arguments?.getString("deviceName") ?: ""

            DeviceDetailScreen(
                deviceName = deviceName,
                navController = navController
            )
        }
    }
}