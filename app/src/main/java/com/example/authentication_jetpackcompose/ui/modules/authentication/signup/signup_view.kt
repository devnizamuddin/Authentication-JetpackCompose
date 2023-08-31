package com.example.authentication_jetpackcompose.ui.modules.authentication.signup

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.authentication_jetpackcompose.ui.components.AuthTextField

@Composable
fun SignupView(){
    val TAG = "LOGIN_UI"
    val context = LocalContext.current
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "SignUp Page", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))

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
        Button(
            onClick = {
                // showToast(context, "Value \nEmail = ${email.value}\nPassword=${password.value}")
                Log.d(TAG, "Value \nEmail = ${email.value}\nPassword=${password.value}")
            }, modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)

        ) {
            Text(text = "SIGNUP")
        }
    }
}

fun showToast(context: Context, text: String) {
    Toast.makeText(context, text, Toast.LENGTH_LONG).show()
}
