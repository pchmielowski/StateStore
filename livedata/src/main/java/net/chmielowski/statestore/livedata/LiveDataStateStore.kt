package net.chmielowski.statestore.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import net.chmielowski.statestore.core.StateStore

class LiveDataStateStore<STATE>(initial: STATE) : StateStore<STATE> {

    override val currentState get() = _state.value!!

    private val _state = MutableLiveData<STATE>(initial)

    val state: LiveData<STATE> = _state

    override fun setState(reducer: STATE.() -> STATE) {
        val previous = currentState
        val new = reducer(previous)
        _state.value = new
    }
}
