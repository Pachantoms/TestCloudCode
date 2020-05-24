pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..trigger'
                sh'ls'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing.. build trigger'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
