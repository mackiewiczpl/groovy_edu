pipeline {
    agent {label 'kubeagent'}

    stages {
        stage('Hello') {
            steps {
                HOST=hostname
                echo "Hello World From $HOST"
            }
        }
    }
}
