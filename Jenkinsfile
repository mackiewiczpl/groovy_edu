pipeline {
    agent {label 'kubeagent'}

    stages {
        stage('Hello') {
            steps {
                HOST = sh (
                    script: 'hostname',
                    returnStdout: true
                ).trim()
                echo "Hostname: ${HOST}"

            }
        }
    }
}
