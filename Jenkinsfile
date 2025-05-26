@Library("my-shared-library") _
pipeline {
    agent any
    tools {
        maven 'Maven3' 
    }
    stages {
        stage('Checkout') {
            steps {
                checkout changelog: false, poll: false, scm: scmGit(branches: [[name: 'main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AnushreeGM/Jenkins-shared-library.git']])
            }
        }
        stage('Hello') {
            steps {
                helloWorld()
            }
        }
    }
}
