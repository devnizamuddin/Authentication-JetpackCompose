package com.example.authentication_jetpackcompose.ui.modules.authentication.login

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.authentication_jetpackcompose.ui.components.AuthTextField
import com.example.authentication_jetpackcompose.ui.components.PrimaryButton
import com.example.authentication_jetpackcompose.ui.components.SecondaryButton
import com.example.authentication_jetpackcompose.ui.theme.TextShadowColor

@Composable
fun LoginView() {
    val TAG = "LOGIN_UI"
    val context = LocalContext.current
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(modifier = Modifier.align(Alignment.TopCenter)) {
            Spacer(modifier = Modifier.height(128.dp))
            Text(
                text = "Login Page",
                style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    shadow = Shadow(
                        color = TextShadowColor,
                        offset = Offset(x = 11f, y = 16f),
                        blurRadius = 12f
                    ),
                )
            )
        }

        Column(
            Modifier
                .align(Alignment.Center)
                .background(Color.White)
                .padding(20.dp), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AuthTextField(
                label = "Email",
                value = email.value,
                onValueChange = { email.value = it },
            )
            Spacer(modifier = Modifier.height(10.dp))
            AuthTextField(
                label = "Password",
                value = password.value,
                onValueChange = { password.value = it }
            )
            Spacer(modifier = Modifier.height(20.dp))
            PrimaryButton(text = "LOGIN", onClick = {
                showToast(context, "Value \nEmail = ${email.value}\nPassword = ${password.value}")
                Log.d(TAG, "Value \nEmail = ${email.value}\nPassword = ${password.value}")
            })
            Spacer(modifier = Modifier.height(10.dp))
            SecondaryButton(text = "SIGNUP", onClick = {
                showToast(context, "Value \nEmail = ${email.value}\nPassword = ${password.value}")
                Log.d(TAG, "Value \nEmail = ${email.value}\nPassword = ${password.value}")
            })
        }
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            Text(
                text = "Jetpack Compose",

                style = TextStyle(
                    shadow = Shadow(
                        color = TextShadowColor,
                        offset = Offset(8f, 8f),
                        //blurRadius = 4f
                    ),
                    color = Color.Gray,
                    letterSpacing = 4.sp,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                ),
            )
            Spacer(modifier = Modifier.height(128.dp))

        }
    }

}

fun showToast(context: Context, text: String) {
    Toast.makeText(context, text, Toast.LENGTH_LONG).show()
}
