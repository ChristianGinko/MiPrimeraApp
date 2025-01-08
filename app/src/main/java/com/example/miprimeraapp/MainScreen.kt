package com.example.miprimeraapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private val messages: List<MyMessage> = listOf(
    MyMessage("Orden Jedi"),
    MyMessage("Orden Jedi 2"),
    MyMessage("Orden Jedi 3"),
    MyMessage("Orden Jedi 4"),
    MyMessage("Orden Jedi 5"),
    MyMessage("Orden Jedi 6"),
    MyMessage("Orden Jedi 7"),
    MyMessage("Orden Jedi 8"),
    MyMessage("Orden Jedi 9"),
    MyMessage("Orden Jedi 10"),
    MyMessage("Orden Jedi 11"),
    MyMessage("Orden Jedi 12")
)

@Composable
fun MainScreen() {
        MyMessages(messages)
}

@Composable
fun MyComponent (message: MyMessage) {
    Row(modifier = Modifier
        .background(Color.Blue)
        .border(5.dp, Color.Black)
        .padding(20.dp)
        .fillMaxWidth()
    ) {
        MyImage()
        Spacer(modifier = Modifier.width(100.dp))
        MyText(message)
    }
}

data class MyMessage(val title: String)

@Composable
fun MyMessages (messages: List<MyMessage>) {
    LazyColumn{
        items(messages) {message ->
            MyComponent(message)
        }
    }
}

@Composable
fun MyImage () {
    Image(
        painter = painterResource(id = R.drawable.orden_jedi),
        contentDescription = null,
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
    )
}

@Composable
fun MyText (message: MyMessage) {
    Column() {
        Text(
            message.title,
            color = Color.White,
            modifier = Modifier
        )
    }
}

@Preview(showBackground=true)
@Composable
fun MainScreenPreview(){
    MainScreen()
}

@Preview(showBackground=true)
@Composable
fun MyComponentPreview(){
    MyMessages(messages)
}