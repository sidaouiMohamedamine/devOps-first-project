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
                    sh 'docker build -t sidaouimohamedamine/devops-project-sid .'
                }
            }
        }
            stage('Push  to Docker Hub'){
        steps{
            script{
                // Définit les variables d'environnement pour Docker Hub
                env.DOCKER_USERNAME = "sidaouimohamedamine"
    
                // Utilise withCredentials pour accéder aux informations d'identification Docker Hub
                withCredentials([usernamePassword(credentialsId: 'dockerhub-pwd', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                    // Se connecte à Docker Hub
                    sh 'docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD'
                    // Poussette l'image vers Docker Hub
                    sh 'docker push sidaouimohamedamine/devops-project-sid'
                }
            }
        }
    }
        }
    
}
