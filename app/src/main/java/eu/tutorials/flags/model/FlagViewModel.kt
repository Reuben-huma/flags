package eu.tutorials.flags.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import eu.tutorials.flags.data.DataSource

class FlagViewModel : ViewModel() {
    private var _count = MutableLiveData<Int>()
    val count: LiveData<Int> = _count

    private var _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private var _options = MutableLiveData<List<String>>()
    val options: LiveData<List<String>> = _options

    private val flags: List<Flag> = DataSource().getQuestions()

    init {
        _count.value = 1
        _image.value = flags[0].image
        _options.value = flags[0].options
    }

    fun nextQuestion() {
        _count.value = count.value?.inc()
        _image.value = flags[count.value!!].image
        _options.value = flags[count.value!!].options
    }
}