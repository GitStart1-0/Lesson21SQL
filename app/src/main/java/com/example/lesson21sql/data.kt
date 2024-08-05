package com.example.lesson21sql

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query

@Entity
data class Employee(@PrimaryKey(autoGenerate = true) val id:Int?=null, val
										name:String, val position:String)

@Dao
interface EmployeeDao {
	@Insert
	fun add(employee: Employee)
	@Delete
	fun delete(employee: Employee)
	@Query("SELECT * FROM employee")
	fun getAll(): LiveData<List<Employee>>
}