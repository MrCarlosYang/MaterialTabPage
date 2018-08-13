package com.me.cl.materialtabhost.mvp.base

import android.arch.lifecycle.Lifecycle
import android.os.Bundle
import com.me.cl.materialtabhost.data.entities.City
import com.trello.rxlifecycle2.LifecycleProvider
import io.reactivex.Observable

interface MainView {
    fun bindToViewPager(twoList: List<List<City>>)
}

interface MainPresenter {
    fun manage(view: MainView)
    fun init(provider: LifecycleProvider<Lifecycle.Event>, savedInstanceState: Bundle?)
    fun saveState(outState: Bundle)
    fun destroy()
}

interface MainInteractor {
    fun fetchCityList(): Observable<List<City>>
    fun divideIntoTwoList(totalList: List<City>): List<List<City>>
    fun saveState(key: String, state: Any?)
    fun saveWholeState(outState: Bundle)
    fun restoreFromState(outState: Bundle?): Boolean
    fun getState(key: String): Any?
    fun release()
}