package com.smartherd.laztcolumn.repository

import com.smartherd.laztcolumn.model.Person

class PersonRepository(){
    fun getAllData():List<Person>{
        return listOf(

            Person(
                0, "Jhon", "Doe", 20
            ),
            Person(
                1, "Maria", "Gracia", 21
            ),
            Person(
                2, "James", "Jameson", 22
            ),
            Person(
                3, "Michael", "Brown", 23
            ),
            Person(
                4, "Robert", "Davis", 24
            ),
            Person(
                5, "Jenifer", "Miller", 25
            ),
            Person(
                6, "Sarah", "Lopez", 26
            ),
            Person(
                7, "Charles", "Wilson", 27
            )
        )
    }
}

