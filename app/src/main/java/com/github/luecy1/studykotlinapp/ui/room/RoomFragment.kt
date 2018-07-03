package com.github.luecy1.studykotlinapp.ui.room

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.luecy1.studykotlinapp.MyApplication
import com.github.luecy1.studykotlinapp.R
import com.github.luecy1.studykotlinapp.room.User
import com.google.android.material.snackbar.Snackbar
import java.util.*


class RoomFragment : Fragment() {

    companion object {
        fun newInstance() = RoomFragment()
    }

    private lateinit var viewModel: RoomViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.room_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RoomViewModel::class.java)

        val dao = MyApplication.database.userDao()

        val user = User(
                1L,
                "First User",
                Date()
        )
        dao.createUser(user)
    }

    open fun showSnackBar(text: String) {
        Snackbar.make(this.view!!,text,Snackbar.LENGTH_SHORT).show()
    }
}
