package io.github.devyoung.clubmanager.presentation


sealed class MainRouter(override val destination: String) : Router {
    object SignIn : MainRouter("SignIn")
    object ScheduleList : MainRouter("ScheduleList")
}