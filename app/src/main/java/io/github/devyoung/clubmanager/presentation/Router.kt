package io.github.devyoung.clubmanager.presentation

sealed interface Router {
    val destination: String
}