package com.intentsoft.memory.twonote.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.intentsoft.memory.twonote.feature_note.domain.model.Note

/**
 * @author user
 * @date 23.09.2021
 */
@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}