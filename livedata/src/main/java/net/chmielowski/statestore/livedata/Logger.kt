package net.chmielowski.statestore.livedata

import androidx.annotation.Keep

@Keep
interface Logger<STATE> {

    fun log(old: STATE, new: STATE)

    companion object {

        internal class NoOp<STATE> : Logger<STATE> {

            override fun log(old: STATE, new: STATE) {
            }
        }
    }
}
