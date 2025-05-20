package com.example.Application.ui.screens.common

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HelpAndSupportScreen(
    onContactSupportClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Help & Support",
//            style = MaterialTheme.typography.h5
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "If you have any questions or issues, feel free to reach out to our support team.",
//            style = MaterialTheme.typography.body1
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = onContactSupportClick) {
            Text("Contact Support")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HelpAndSupportScreenPreview() {
    HelpAndSupportScreen()
}
