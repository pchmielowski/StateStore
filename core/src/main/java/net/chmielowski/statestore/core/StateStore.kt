package net.chmielowski.statestore.core

interface StateStore<STATE> {

    val currentState: STATE

    fun setState(reducer: STATE.() -> STATE)
}
