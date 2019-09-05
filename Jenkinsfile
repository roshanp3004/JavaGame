pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
               git checkout master
               sh 'echo "Compile"'
               sh 'javac src/Main.java'
               sh 'pwd'
               sh 'ls'
               git commit -am "Updated version number"
            }
        }

        stage ('Testing Stage') {

            steps {
               sh 'echo "Testing"'
               cd src
               sh 'ls'
               sh 'pwd'
               sh 'java Main'
            }
        }


        stage ('Deployment Stage') {
            steps {
              sh 'echo "Deployment"'
            }
        }
    }
}
