package edu.vanderbilt.grader.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GraderPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().create("hello", Grader.class, (task) -> { // <1>
            task.setMessage("Vanderbilt");
            task.setRecipient("Unversity");                                // <2>
        });
    }
}
