package xyz.gonzapico.imaginaformacion_test

class UserPresenter (val userView: UserView) {
    init {
        userView.showLoading()
        getUsers()
        userView.hideLoading()
    }

    fun getUsers() {
        val userList = createGroupOfUsers()
        userView.loadUsers(userList)
    }
}
