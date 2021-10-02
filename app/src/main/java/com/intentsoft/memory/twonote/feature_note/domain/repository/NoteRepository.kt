package com.intentsoft.memory.twonote.feature_note.domain.repository

import com.intentsoft.memory.twonote.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * @author user
 * @date 23.09.2021
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}