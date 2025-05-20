package com.example.Application.ui.screens.common

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ErrorScreen(
    message: String = "Something went wrong.",
    onRetry: (() -> Unit)? = null
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Error",
//            style = MaterialTheme.typography.h6.copy(fontSize = 22.sp),
//            color = MaterialTheme.colors.error
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = message,
//            style = MaterialTheme.typography.body1
        )

        Spacer(modifier = Modifier.height(20.dp))

        onRetry?.let {
            Button(onClick = it) {
                Text("Retry")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ErrorScreenPreview() {
    ErrorScreen(message = "Failed to load data", onRetry = {})
}
