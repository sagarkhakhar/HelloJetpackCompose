package com.sagar.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sagar.hellojetpackcompose.ui.theme.HelloJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        MyComposable()
                        MyTextComponent()
                        MyImageComponent()
                        MyButtonComponent()
                        MyColumnLayout()
                        MyRowLayout()
                        MyStackLayout()
                        MyStyledText()
                    }

                }
            }
        }
    }
}

@Composable
fun MyComposable() {
    Column {
        Text(text = "Hello, Jetpack Compose!")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /* TODO: Handle button click */ }) {
            Text(text = "Click Me!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyComposablePreview() {
    MyComposable()
}

@Composable
fun MyTextComponent() {
    Text(text = "Hello, Compose!")
}

@Composable
fun MyImageComponent() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = null,
        modifier = Modifier
            .padding(16.dp)
            .background(color = Color.Green)
    )
}

@Composable
fun MyButtonComponent() {
    Button(onClick = { /* Handle button click */ }) {
        Text(text = "Click Me")
    }
}

@Composable
fun MyColumnLayout() {
    Column {
        Text(text = "First Item")
        Text(text = "Second Item")
    }
}
@Composable
fun MyRowLayout() {
    Row {
        Text(text = "Left Item")
        Text(text = "Right Item")
    }
}

@Composable
fun MyStackLayout() {
    Box {
        Text(text = "On top")
        Text(text = "Below")
    }
}

@Composable
fun MyStyledText() {
    Text(
        text = "Styled Text",
        modifier = Modifier
            .padding(16.dp)
            .background(color = Color.LightGray)
            .fillMaxWidth()
            .clickable { /* Handle click */ }
    )
}

