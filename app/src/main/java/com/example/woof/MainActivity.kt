package com.example.woof

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.woof.data.Dog
import com.example.woof.data.dogs
import com.example.woof.ui.theme.WoofTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WoofTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    WoofApp()
                }
            }
        }
    }
}

@Composable
fun WoofApp() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        AppTitle()
        DogList()
    }
}

@Composable
fun AppTitle() {
    Text(
        text = "30 Days of Famous Quotes",
        modifier = Modifier.padding(16.dp),
        fontSize = 10.em
    )
}

@Composable
fun DogList() {
    LazyColumn {
        items(dogs) { dog ->
            DogItem(
                dog = dog,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
            )
        }
    }
}

@Composable
fun DogItem(
    dog: Dog,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioNoBouncy,
                    stiffness = Spring.StiffnessMedium
                )
            )
            .clickable { expanded = !expanded }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            DogIcon(dog.imageResourceId)
            Spacer(modifier = Modifier.height(16.dp))
            DogInformation(dog.day, dog.name, dog.quote, expanded)
        }
    }
}

@Composable
fun DogIcon(
    @DrawableRes dogIcon: Int
) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        painter = painterResource(dogIcon),
        contentDescription = null,
        contentScale = ContentScale.FillHeight
    )
}

@Composable
fun DogInformation(
    dogDay: String,
    dogName: String,
    dogQuote: String,
    expanded: Boolean
) {
    Column {
        Text(
            text = "Day $dogDay",
            modifier = Modifier.padding(bottom = 4.dp),
            fontSize = 7.em
        )
        Text(
            text = dogName,
            modifier = Modifier.padding(bottom = 4.dp),
            fontSize = 5.em
        )
        if (expanded) {
            Text(
                text = "\"$dogQuote\"",
                modifier = Modifier.padding(bottom = 4.dp),
                fontSize = 5.em,
                fontFamily = FontFamily.Monospace,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}


@Preview
@Composable
fun WoofPreview() {
    WoofTheme(darkTheme = false) {
        WoofApp()
    }
}

@Preview
@Composable
fun WoofDarkThemePreview() {
    WoofTheme(darkTheme = true) {
        WoofApp()
    }
}
