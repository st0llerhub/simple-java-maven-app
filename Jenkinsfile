pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    environment {
              VERSION = '1.7'
    }
    stages {
        stage('Build') {
            steps {
                echo "Building... V.${VERSION}"
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
            echo 'Deploy...'
                sh './jenkins/scripts/deliver.sh' 
            }
        }
    }
}