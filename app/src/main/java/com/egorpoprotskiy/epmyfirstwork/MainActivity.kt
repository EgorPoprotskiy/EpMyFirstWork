package com.egorpoprotskiy.epmyfirstwork

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.egorpoprotskiy.epmyfirstwork.ui.theme.EpMyFirstWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EpMyFirstWorkTheme {
//                EpMyFirstWorkApp()
            }
        }
    }
}

@Composable
fun EpMyFirstWorkApp() {
    Column {
        LogoAndPerson(
            logoPerson = ImageBitmap.imageResource(R.drawable.logo),
            fullName = stringResource(id = R.string.full_name),
            description = stringResource(id = R.string.description)
        )
        Column {
            ShareData(
                icon = ImageVector.vectorResource(id = R.drawable.baseline_local_phone_24),
                textInfo = stringResource(id = R.string.phone)
            )
            ShareData(
                icon = ImageVector.vectorResource(id = R.drawable.baseline_share_24),
                textInfo = stringResource(id = R.string.instagram)
            )
            ShareData(
                icon = ImageVector.vectorResource(id = R.drawable.baseline_email_24),
                textInfo = stringResource(id = R.string.mail)
            )
        }
    }
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
            contentDescription = null,
            modifier = Modifier
                .size(200.dp, 200.dp)
        )
        Text(
            text = fullName,
            textAlign = TextAlign.Center
        )
        Text(
            text = description,
        )
    }
}

@Composable
fun ShareData(
    icon: ImageVector,
    textInfo: String
) {
    Row {
        Image(
            icon,
            contentDescription = null,
            modifier = Modifier
                .size(50.dp, 50.dp)
        )
        Text(
            text = textInfo
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