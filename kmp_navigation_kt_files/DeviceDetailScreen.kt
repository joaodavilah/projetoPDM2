package navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DeviceDetailScreen(
    deviceName: String,
    navController: NavController
) {

    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Text(
            text = "Detalhes do Dispositivo",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = deviceName,
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.popBackStack() }
        ) {
            Text("Voltar")
        }
    }
}