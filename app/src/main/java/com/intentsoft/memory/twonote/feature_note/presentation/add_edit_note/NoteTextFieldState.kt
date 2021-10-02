package com.intentsoft.memory.twonote.feature_note.presentation.add_edit_note

/**
 * @author user
 * @date 23.09.2021
 */
data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)