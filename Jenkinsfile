pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            tools {
               jdk "Oracle JDK 8"
            }
            steps {
               sh 'echo "Compile"'
               sh 'java -version'
               sh 'pwd'
            }
        }

        stage ('Testing Stage') {

            steps {
               sh 'echo "Testing"'
            }
        }


        stage ('Deployment Stage') {
            steps {
              sh 'echo "Deployment"'
            }
        }
    }
}
