pipeline {
    agent any
    stages {
        stage('Clonar repositório Codigo Modificado') {
            steps {
                git branch: 'main', url: 'https://github.com/CaioSeisdedos/ativFelipe.git'
            }
        }
        stage('Construir Codigo Modificado') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew build'
            }
        }
        stage('Testar Codigo Modificado') {
            steps {
                sh './gradlew test'
            }
        }
    }
}
