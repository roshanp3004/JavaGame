pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
               sh 'echo "Compile"'
               sh 'javac /src/Main.java'
               sh 'pwd'
            }
        }

        stage ('Testing Stage') {

            steps {
               sh 'echo "Testing"'
               sh 'java /src/Main'
            }
        }


        stage ('Deployment Stage') {
            steps {
              sh 'echo "Deployment"'
            }
        }
    }
}
