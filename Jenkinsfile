pipeline {
    agent any

    stages {
        stage('Download repositorie project') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/lulumeisterr/JAVA-ADVANCED-FRAMEWORKS.git'
                
            }
        }
           
            stage('Mvn Build') {
                steps {
                    dir("${env.WORKSPACE}/StrategyPatterns") {
                            sh "mvn package -DskipTests=true"
                        }
                }
           
            }
    }
}
