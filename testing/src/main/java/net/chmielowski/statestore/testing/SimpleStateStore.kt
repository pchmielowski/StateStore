package net.chmielowski.statestore.testing;

import net.chmielowski.statestore.core.StateStore

class SimpleStateStore<STATE>(private var state: STATE) : StateStore<STATE> {

    override val currentState get() = state

    override fun setState(reducer: STATE.() -> STATE) {
        state = reducer(state)
    }
}
