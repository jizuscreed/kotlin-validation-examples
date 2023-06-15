package com.example.myapplication

interface Validator {
    fun validate(data : Map<String, String>) : Boolean
}