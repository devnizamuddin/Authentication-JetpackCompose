package com.example.authentication_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.authentication_jetpackcompose.ui.modules.authentication.login.LoginView
import com.example.authentication_jetpackcompose.ui.theme.AuthenticationJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AuthenticationJetpackComposeTheme {
                LoginView()
            }
        }
    }

    @Preview
    @Composable
    fun DefaultPreview(){
        val context = LocalContext.current
        LoginView()

    }
}

