pipeline {
    agent {label 'agent1'}

    stages {
        stage('Hello') {
            steps {
                def hostname = sh "hostname"
                echo 'Hello World From feature branch'
            }
        }
    }
}
