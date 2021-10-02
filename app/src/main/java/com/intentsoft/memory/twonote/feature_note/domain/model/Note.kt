package com.intentsoft.memory.twonote.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.intentsoft.memory.twonote.ui.theme.*
import java.lang.Exception

/**
 * @author user
 * @date 23.09.2021
 */
@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey
    val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)
