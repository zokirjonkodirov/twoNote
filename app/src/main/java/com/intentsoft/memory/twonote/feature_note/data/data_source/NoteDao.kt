package com.intentsoft.memory.twonote.feature_note.data.data_source

import androidx.room.*
import com.intentsoft.memory.twonote.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * @author user
 * @date 23.09.2021
 */
@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
     fun getNotes(): Flow<List<Note>>

     @Query("SELECT * FROM note WHERE id = :id ")
     suspend fun getNoteById(id: Int): Note?

     @Insert(onConflict = OnConflictStrategy.REPLACE)
     suspend fun insertNote(note: Note)

     @Delete
     suspend fun deleteNote(note: Note)
}