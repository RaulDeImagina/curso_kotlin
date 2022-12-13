package xyz.gonzapico.imaginaformacion_test

import java.util.*

class UserPresenter(val userView: UserView) {

    init {
        userView.showLoading()
        getUsers()
    }

    fun getUsers(){
        val usersList = createGroupOfUsers()
        userView.loadUsers(usersList)
        userView.hideLoading()
    }

    private fun createGroupOfUsers() = listOf(
        UserModel("Alberto", "Perez", "1986"),
        UserModel("Sonia", "Martinez", "1987"),
        UserModel("Adrian", "Perez", "2020")
    )
}