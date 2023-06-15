package com.example.myapplication.rules

import com.example.myapplication.Rule

class MinLength(minLength: Int) : Rule
{
    override fun validate(value: String) : Boolean
    {
        return true;
    }
}