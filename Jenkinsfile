def project = 'try_jenkins_scripts'

node() {
ciPipeline(
            checkout: {
                stage('Checkout'){
                    checkout scm
                }
            },
            build: { failableStage ->
                failableStage('Build') {
                    steps {
                                  sh 'echo "Compile"'
                               }
                }

            },
            unitTest: { failableStage ->
                failableStage('Unit Test') {
                   steps {
                                 sh 'echo "Testing"'
                              }
               }
            },
           // test:{},
        )

 }

 /*
pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
               sh 'echo "Compile"'
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
*/
