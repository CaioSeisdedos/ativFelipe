pipeline {
    agent any
    stages {
        stage('Clonar repositório') {
            steps {
                git branch: 'master', url: 'https://github.com/CaioSeisdedos/ativFelipe.git'
            }
        }
        stage('Construir ') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew build'
            }
        }
        stage('Testar') {
            steps {
                sh './gradlew test'
            }
        }
    }
}
