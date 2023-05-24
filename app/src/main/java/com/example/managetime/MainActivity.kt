package com.example.managetime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.managetime.ui.theme.HomeScreen
import com.example.managetime.ui.theme.ManageTimeTheme

private val taskList = mutableListOf<TodoList>()

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )
            taskList.add(
                TodoList("Complete today's tasks", false)
            )


            HomeScreen(taskList)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ManageTimeTheme {
        HomeScreen(taskList)
    }
}
