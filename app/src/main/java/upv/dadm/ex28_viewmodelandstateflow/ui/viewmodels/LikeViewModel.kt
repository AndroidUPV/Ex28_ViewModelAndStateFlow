/*
 * Copyright (c) 2022-2023 Universitat Politècnica de València
 * Authors: David de Andrés and Juan Carlos Ruiz
 *          Fault-Tolerant Systems
 *          Instituto ITACA
 *          Universitat Politècnica de València
 *
 * Distributed under MIT license
 * (See accompanying file LICENSE.txt)
 */

package upv.dadm.ex28_viewmodelandstateflow.ui.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update

/**
 * Holds the the number of likes received and provides methods for updating it.
 */
class LikeViewModel : ViewModel() {

    // UI state (mutable): number of likes
    private val _likeUiState = MutableStateFlow(0)

    // Backing property (immutable)
    val likeUiState: Flow<String> = _likeUiState.map { currentState ->
        currentState.toString()
    }

    /**
     * Increases the current number of likes.
     */
    fun thumbUp() {
        _likeUiState.update { currentState ->
            currentState + 1
        }
    }

    /**
     * Decreases the current number of likes (it can be negative!).
     */
    fun thumbDown() {
        _likeUiState.update { currentState ->
            currentState - 1
        }
    }

}