def call(Map config) {
    
    if (config.type == "maven") {
        mavenPipeline();
    } else {
        pipeline {
            agent any
            stages {
                stage("Unsupported pipeline") {
                    steps {
                        script {
                            echo("Unsupported pipeline")
                        }
                    }
                }
            }
        }
    }

}