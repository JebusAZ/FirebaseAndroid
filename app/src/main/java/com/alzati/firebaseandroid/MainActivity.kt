package com.alzati.firebaseandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alzati.firebaseandroid.navigation.Navigation
import com.alzati.firebaseandroid.screens.login.LoginScreen
import com.alzati.firebaseandroid.screens.login.LoginScreenViewModel
import com.alzati.firebaseandroid.ui.theme.FireBaseAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FireBaseAndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FireBaseAndroid()
                }
            }
        }
    }
}

@Composable
fun FireBaseAndroid(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .padding(top = 46.dp),
        color = MaterialTheme.colorScheme.background){
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Navigation()
        }
    }
}

