package com.example.authentication_jetpackcompose.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.authentication_jetpackcompose.ui.theme.Purple500

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick, modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)

    ) {
        Text(text = text)
    }
}

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        border = BorderStroke(1.dp, Purple500)
    ) {
        Text(text = text)
    }
}