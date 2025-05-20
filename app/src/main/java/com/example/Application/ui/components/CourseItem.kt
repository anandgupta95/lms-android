
package com.example.Application.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.Application.model.Course

@Composable
fun CourseItem(course: Course) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = course.title, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Taught by: ${course.taughtBy}", style = MaterialTheme.typography.bodyMedium)
            Text(text = course.description, style = MaterialTheme.typography.bodySmall)
            Text(text = "Subject: ${course.subject}", style = MaterialTheme.typography.bodySmall)
            Text(text = "Batch: ${course.batch}", style = MaterialTheme.typography.bodySmall)
            Text(text = "Price: ₹${course.price}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Enrolled: ${course.noOfEnrolled}", style = MaterialTheme.typography.bodySmall)
        }
    }
}
