pipeline {
    agent any
    tools{
       maven 'M2_HOME'
}
    stages{
        stage('Build Maven'){
            steps{
                    checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/sidaouiMohamedamine/devops-project-sid.git']])
                    sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t devops-project-sid .'
                }
            }
        }

         stage('Push To Docker Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'sid-dockerHub-pwd', variable: 'dockerHub-pwd')]) {
                    sh 'docker login -u sidaouimohamedamine -p ${dockerHub-pwd}'
}
                    sh 'docker push devops-project-sid'

                }
            }
        }

        }


}