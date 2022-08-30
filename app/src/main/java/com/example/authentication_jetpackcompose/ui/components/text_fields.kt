import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun AuthTextField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        label = { Text(text = label) },
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth()
    )
}