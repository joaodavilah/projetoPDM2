package navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DeviceListScreen(navController: NavController) {

    val devices = listOf(
        "iPhone 15",
        "Galaxy S24",
        "Pixel 8"
    )

    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = "Lista de Dispositivos",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {

            items(devices) { device ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable {
                            navController.navigate("detail/$device")
                        }
                ) {

                    Text(
                        text = device,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}