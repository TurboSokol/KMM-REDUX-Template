package com.turbosokol.kmmreduxtemplate.screensStates

import com.turbosokol.kmmreduxtemplate.core.redux.Action
import com.turbosokol.kmmreduxtemplate.core.redux.GeneralState

/***
 *If this code runs it was created by Evgenii Sokol.
 *If it doesn’t work, I don’t know who was created it.
 ***/

data class HomeScreenState(
    val inProgress: Boolean
) : GeneralState {
    companion object {
        fun getInitState(): HomeScreenState = HomeScreenState(
            inProgress = false
        )
    }
}

sealed class HomeScreenAction : Action {
    data class SetProgress(val inProgress: Boolean) : HomeScreenAction()
}
