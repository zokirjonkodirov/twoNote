package com.intentsoft.memory.twonote.ui

import com.intentsoft.memory.twonote.feature_note.domain.util.OrderType

/**
 * @author user
 * @date 23.09.2021
 */
sealed class NoteOrder(
    val orderType: OrderType
) {

    class Title(orderType: OrderType): NoteOrder(orderType)
    class Date(orderType: OrderType): NoteOrder(orderType)
    class Color(orderType: OrderType): NoteOrder(orderType)

    fun copy(orderType: OrderType): NoteOrder {
        return when(this) {
            is Title -> Title(orderType)
            is Date -> Date(orderType)
            is Color -> Color(orderType)
        }
    }
}