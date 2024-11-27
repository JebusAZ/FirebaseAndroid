package com.alzati.firebaseandroid.screens.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

class LoginScreenViewModel: ViewModel() {
    private val auth: FirebaseAuth = Firebase.auth
    private val _loading = MutableLiveData(false)

    fun signInWithEmailandPassword(email: String,password: String, home: ()-> Unit) = viewModelScope.launch {
        try {
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.d("Firebase", "signInWithEmailandPassword logged in!")
                    home()
                }else{
                    Log.d("Firebase", "signInWithEmailandPassword: ${task.result.toString()}")
                }
            }
        }catch (ex:Exception){
            Log.d("Firebase", "signInWithEmailandPassword ${ex.message}")
        }
    }
}