package com.example.bottomnavigation.helper

import androidx.fragment.app.Fragment
import com.example.bottomnavigation.R
import com.example.bottomnavigation.ui.mahasiswa.KonsultasiFragment
import com.example.bottomnavigation.ui.mahasiswa.HomeFragment
import com.example.bottomnavigation.ui.mahasiswa.StatusFragment
import com.example.bottomnavigation.ui.mahasiswa.ChatFragment

enum class BottomNavigationPosition(val position: Int, val id: Int) {
    HOME(0, R.id.home),
    DASHBOARD(1, R.id.dashboard),
    NOTIFICATIONS(2, R.id.notifications),
    PROFILE(3, R.id.profile);
}

fun findNavigationPositionById(id: Int): BottomNavigationPosition = when (id) {
    BottomNavigationPosition.HOME.id -> BottomNavigationPosition.HOME
    BottomNavigationPosition.DASHBOARD.id -> BottomNavigationPosition.DASHBOARD
    BottomNavigationPosition.NOTIFICATIONS.id -> BottomNavigationPosition.NOTIFICATIONS
    BottomNavigationPosition.PROFILE.id -> BottomNavigationPosition.PROFILE
    else -> BottomNavigationPosition.HOME
}

fun BottomNavigationPosition.createFragment(): Fragment = when (this) {
    BottomNavigationPosition.HOME -> HomeFragment.newInstance()
    BottomNavigationPosition.DASHBOARD -> KonsultasiFragment.newInstance()
    BottomNavigationPosition.NOTIFICATIONS -> StatusFragment.newInstance()
    BottomNavigationPosition.PROFILE -> ChatFragment.newInstance()
}

fun BottomNavigationPosition.getTag(): String = when (this) {
    BottomNavigationPosition.HOME -> HomeFragment.TAG
    BottomNavigationPosition.DASHBOARD -> KonsultasiFragment.TAG
    BottomNavigationPosition.NOTIFICATIONS -> StatusFragment.TAG
    BottomNavigationPosition.PROFILE -> ChatFragment.TAG
}

