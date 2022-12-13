package xyz.gonzapico.imaginaformacion_test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UsersViewModel : ViewModel() {

    val usersModel = MutableLiveData<UserListModel>()

    fun getUsers() {
        val usersList = createGroupOfUsers()
        val userListModel = UserListModel(usersList)
        usersModel.postValue(userListModel)
    }

    private fun createGroupOfUsers() = listOf(
        UserModel("Alberto", "Perez", "1986"),
        UserModel("Sonia", "Martinez", "1987"),
        UserModel("Adrián", "Pérez", "2020")
    )
}