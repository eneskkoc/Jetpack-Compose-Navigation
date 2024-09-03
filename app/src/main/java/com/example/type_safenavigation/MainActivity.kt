package com.example.type_safenavigation

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.type_safenavigation.ui.MyAppNavigation
import com.example.type_safenavigation.ui.theme.TypeSafeNavigationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color =MaterialTheme.colorScheme.background) {
                TypeSafeNavigationTheme {
                    MyAppNavigation()
                }

            }
        }
    }
}



