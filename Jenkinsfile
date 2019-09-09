def project = 'try_jenkins_scripts'
def branchType
def baseVersion
def pullRequest
def isMainline = false
def branch = '/master')
def versions = [project] //if multiples, need to track as a list, can track latest
def label = "${project}-${branch.replace(/_/,'-').toLowerCase()}-123"
//def pullSecrets = ['reg.vibrenthealth.com', 'dockergroup.vibrenthealth.com']
def dev_branch = "develop"
def version = "$branch-123"


 node(label) {
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
