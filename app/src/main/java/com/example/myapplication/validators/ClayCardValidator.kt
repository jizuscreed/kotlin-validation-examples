package com.example.myapplication.validators

import com.example.myapplication.Rule
import com.example.myapplication.rules.MaxLength
import com.example.myapplication.rules.MinLength
import com.example.myapplication.Validator

class ClayCardValidator : Validator
{
    private fun getRules() : Map<String, List<Rule>>
    {
        return mapOf(
            "fieldname" to listOf<Rule>(
                MinLength(1),
                MaxLength(30),
            )
        )
    }

    override fun validate(data: Map<String, String>): Boolean {
        var result = true

        data.forEach { (fieldName, value) ->
            getRules().forEach { (_, rules) ->
                rules.forEach { rule ->
                    if (!rule.validate(value)) {
                        result = false
                        // todo дописать тут сохранение ошибок в отдельный массив для отдачи отдельным методом
                    }
                }
            }
        }

        return result
    }
}