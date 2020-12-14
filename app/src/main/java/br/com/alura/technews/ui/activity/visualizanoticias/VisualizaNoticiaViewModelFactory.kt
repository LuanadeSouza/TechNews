package br.com.alura.technews.ui.activity.visualizanoticias

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.alura.technews.repository.NoticiaRepository

class VisualizaNoticiaViewModelFactory(
    private val id: Long,
    private val repository: NoticiaRepository
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return VisualizaNoticiaViewModel(id, repository) as T
    }

}