package io.github.devyoung.clubmanager.presentation.scene.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    val test = MutableStateFlow(0)

    init {
        viewModelScope.launch(Dispatchers.Default) {
            repeat(300) {
                test.value = it
                delay(500)
            }
        }
    }
}