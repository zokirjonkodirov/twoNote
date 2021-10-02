package com.intentsoft.memory.twonote.feature_note.domain.use_case

import com.intentsoft.memory.twonote.feature_note.domain.model.Note
import com.intentsoft.memory.twonote.feature_note.domain.repository.NoteRepository

/**
 * @author user
 * @date 23.09.2021
 */

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}