package com.github.xukeek.ideatest.services

import com.intellij.openapi.project.Project
import com.github.xukeek.ideatest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
