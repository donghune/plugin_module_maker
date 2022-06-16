package com.github.donghune.pluginmodulemaker.services

import com.intellij.openapi.project.Project
import com.github.donghune.pluginmodulemaker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
