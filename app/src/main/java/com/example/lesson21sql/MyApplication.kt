package com.example.lesson21sql

import android.app.Application
import androidx.room.Room

class MyApplication : Application() {
	lateinit var repo:EmployeeRepository
	override fun onCreate() {
		super.onCreate()
		instance = this
		val db = Room.databaseBuilder(this, EmployeeDatabase::class.java,"employee_database")
			.build()
		repo = EmployeeRepository(db)
	}
	companion object {
		private lateinit var instance:MyApplication
		fun getApp() = instance
	}
}