package com.me.cl.materialtabhost.mvvm.data.transform.strategy

import com.me.cl.materialtabhost.mvvm.data.transform.protocol.CityTransformer
import com.me.cl.materialtabhost.data.entities.City
import javax.inject.Inject

class CityTransformerImpl @Inject constructor():CityTransformer {
    override fun divideIntoTwoList(totalList: List<City>): Array<List<City>> {
        val listOne = mutableListOf<City>()
        val listTwo = mutableListOf<City>()

        totalList.forEach {
            if (it.rank.toInt() < 500) {
                listOne.add(it)
            } else {
                listTwo.add(it)
            }
        }
        return arrayOf(listOne,listTwo)
    }
}