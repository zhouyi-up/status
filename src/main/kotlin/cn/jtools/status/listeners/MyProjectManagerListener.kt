package cn.jtools.status.listeners

import cn.jtools.status.services.MyProjectService
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        print("open project is "+ project.name )
        project.service<MyProjectService>()
    }
}
