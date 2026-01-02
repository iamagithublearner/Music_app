package org.hoelab.spotify

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.hoelab.spotify.theme.MoosicTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun App() {
    MoosicTheme {
        Text("Hello")
    }
}