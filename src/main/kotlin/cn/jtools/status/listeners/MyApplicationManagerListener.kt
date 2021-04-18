package cn.jtools.status.listeners

import com.intellij.openapi.application.ApplicationListener

internal class MyApplicationManagerListener : ApplicationListener{

    override fun applicationExiting() {
        println("applicationExiting")
    }

    override fun beforeWriteActionStart(action: Any) {
        println("beforeWriteActionStart")
    }

    override fun writeActionStarted(action: Any) {
        println("writeActionStarted")
    }

    override fun writeActionFinished(action: Any) {
        println("writeActionFinished")
    }

    override fun afterWriteActionFinished(action: Any) {
        println("afterWriteActionFinished")
    }
}