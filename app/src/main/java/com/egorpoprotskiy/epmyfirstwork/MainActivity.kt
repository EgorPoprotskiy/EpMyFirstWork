package com.egorpoprotskiy.epmyfirstwork

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.egorpoprotskiy.epmyfirstwork.ui.theme.EpMyFirstWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EpMyFirstWorkTheme {

            }
        }
    }
}

@Composable
fun EpMyFirstWorkApp() {
    LogoAndPerson(
        logoPerson = ImageBitmap.imageResource(R.drawable.logo),
        fullName = stringResource(id = R.string.full_name),
        description = stringResource(id = R.string.description)
    )
}

@Composable
fun LogoAndPerson(
    logoPerson: ImageBitmap,
    fullName: String,
    description: String
) {
    Column {
        Image (
            logoPerson,
            contentDescription = null
        )
        Text(
            text = fullName,
            textAlign = TextAlign.Center
        )
        Text(
            text = description
        )
    }
}

@Preview(showBackground = false)
@Composable
fun EpMyFirstWorkAppPreview() {
    EpMyFirstWorkTheme {
        EpMyFirstWorkApp()
    }
}