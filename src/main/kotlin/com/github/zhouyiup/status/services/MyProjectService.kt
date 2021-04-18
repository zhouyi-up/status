package com.github.zhouyiup.status.services

import com.github.zhouyiup.status.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
