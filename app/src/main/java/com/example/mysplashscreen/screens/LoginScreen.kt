import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mysplashscreen.navigation.NavigationItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFD166)),  // Fondo FFD166
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to Wooperland", style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(14.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text("Username") },
            singleLine = true,
            colors = androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(14.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,
            colors = androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate( // Navigate to a route in the current NavGraph
                    NavigationItem.Home.route
                )
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEF476F) // Color del botón
            )
        ) {
            Text("Log In")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}
