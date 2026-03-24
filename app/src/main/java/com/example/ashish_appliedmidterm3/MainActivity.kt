package com.example.ashish_appliedmidterm3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ashish_appliedmidterm3.ui.theme.Ashish_AppliedMidterm3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ashish_AppliedMidterm3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StudentListScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun StudentListScreen(modifier: Modifier = Modifier) {
    val students = listOf(
        "Alice", "Bob", "Charlie", "Dana", "Eric",
        "Fatima", "Grace", "Hiro", "Isabel", "Jack",
        "Karen", "Luis", "Maya", "Nate", "Olivia",
        "Priya", "Quinn", "Ravi", "Sara", "Tom"
    )

    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(students) { student ->
            StudentItem(name = student)
        }
    }
}

@Composable
fun StudentItem(name: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF87CEEB) // Sky Blue color
        )
    ) {
        Text(
            text = name,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.titleMedium,
            color = Color.Black // Ensuring text is readable on sky blue
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StudentListPreview() {
    Ashish_AppliedMidterm3Theme {
        StudentListScreen()
    }
}
